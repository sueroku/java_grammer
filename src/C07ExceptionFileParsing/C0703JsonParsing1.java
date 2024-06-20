package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C0703JsonParsing1 {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data1.json");
        String jsonString = Files.readString(filePath);
//        System.out.println(jsonString);
//        readTree : 트리구조의 JsonNode로 변환
//        트리구조의 장점은 유연함
        JsonNode data1 = objectMapper.readTree(jsonString); // 트리 안에 트리가 있어용
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("id", data1.get("id").asText());
        studentMap.put("name", data1.get("name").asText());
        studentMap.put("classNumber", data1.get("classNumber").asText());
        studentMap.put("city", data1.get("city").asText());
        System.out.println(studentMap);

//        readValue : 바로 객체로 변환

        Map<String, String> studentMap2 = objectMapper.readValue(jsonString,Map.class);
        System.out.println(studentMap2);

//        Student 객체 생성 및 toString() 오버라이딩
        Student student3 = objectMapper.readValue(jsonString, Student.class);
        System.out.println(student3);


    }
}

// 왜 getter 혹은 setter가 있어야 objectMapper가 read하는가
// objectMapper 는 getter setter 메서드(이걸로 값을 세팅하는게 아니라) 명(예:getName의 name을 통해)을 통해 필드값을 유추
// 실제 값의 setting은 reflection 이라는 기술을 통해 변수값에 할당
class Student{
    private int id;
    private String name;
    private String classNumber;
    private String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString(){
        return "이름은 "+this.name+" classNumber는 "+this.classNumber+" 출신 도시는 " + this.city;
    }


}

