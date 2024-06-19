package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Spring 에서는 RestTemplate을 통해 Http 요청하고
        //        여기서는 java에 내장된 http 클라이언트 사용
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        String posts = response.body();
//        System.out.println(posts);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode data = objectMapper.readTree(posts);
//        JsonNode data = objectMapper.readTree(response.body());

        List<Post> postList = new ArrayList<>();
        for(JsonNode j : data){
//            Post temp = objectMapper.readValue(j.toString(),Post.class);
//            postList.add(temp);
             postList.add(objectMapper.readValue(j.toString(),Post.class));
        }

//        List<Post>객체를 json으로 직렬화
        String postJson = objectMapper.writeValueAsString(postList);
        System.out.println(postJson);

//        System.out.println(postList);
    }
}

class Post{
    private int id;
    private int userId;
    private String title;
    private String body;

// 보통은 클래스를 setter 없이 만든다.
//    getter 혹은 생성자가 있어야 objectMapper가 일할 수 있는 듯...

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString(){
        return "글쓴이는 " + this.userId + "\n제목은 " + this.title + "\n내용은 " + this.body+"\n\n";
    }
}
