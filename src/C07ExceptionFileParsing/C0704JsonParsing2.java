package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C0704JsonParsing2 {
    public static void main(String[] args) throws IOException {
//        test_data2의 데이터를 student형태로 출력
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data2.json");
        String jsonString = Files.readString(filePath);

//        List<Student> 에 담기
        JsonNode data2 = objectMapper.readTree(jsonString);

        List<Student> studentList = new ArrayList<>();
        for(JsonNode j : data2){
            Student temp = objectMapper.readValue(j.toString(),Student.class);
            studentList.add(temp);
//            Student temp = objectMapper.treeToValue(j,Student.class);
//            studentList.add(objectMapper.readValue(j.toString(), Student.class));
        }
        System.out.println(studentList);

    }
}


