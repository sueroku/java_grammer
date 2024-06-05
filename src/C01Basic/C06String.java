package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {
//      참조 자료형 : 기본자료형을 제외한 모든 자료형
//        WrapperClass 기본형 타입을 Wrapping한 클래스
//        int와 Integer간의 형변환
        int a = 10;
        Integer b = new Integer(20);
//        오토 언박싱 : Integer -> Int 형변환
        int c = b;
//        오토박싱
        Integer d = a;

//        String 과 int의 형변환
//        int -> String
        int a2 = 10;
        String st12 = Integer.toString(a);
        String st22 = String.valueOf(a);
//        String -> int
        int b2 = Integer.parseInt(st12);

//        참조자료형에 원시자료형을 담을 때는 WrapperClass를 써야한다.
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);



        //        string 변수 생성방법
//        객체 생성
        String st1 = new String("hi"); // 기본룰은 이거다.
//        리터럴방식
        String st2 = "hi"; // 성능이 더 좋다.
    }
}
