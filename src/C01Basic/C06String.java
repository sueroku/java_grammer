package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
////      참조 자료형 : 기본자료형을 제외한 모든 자료형
////        WrapperClass 기본형 타입을 Wrapping한 클래스
////        int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
////        오토 언박싱 : Integer -> Int 형변환
//        int c = b;
////        오토박싱
//        Integer d = a;
//
////        String 과 int의 형변환
////        int -> String
//        int a2 = 10;
//        String st12 = Integer.toString(a);
//        String st22 = String.valueOf(a);
////        String -> int
//        int b2 = Integer.parseInt(st12);
//
////        참조자료형에 원시자료형을 담을 때는 WrapperClass를 써야한다.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//
//
//        //        string 변수 생성방법
////        객체 생성
//        String st1 = new String("hi"); // 기본룰은 이거다.
////        리터럴방식 : 권장하는 방식
////        문자열 POOL을 통해 성능향상
//        String st2 = "hi"; // 성능이 더 좋다.
//        String t3 = new String("hello");
//        String t4 = "hello";
//
////        String 문자열 비교는 equals
//        System.out.println(st2 == t3);
//        System.out.println(st1 == t4);
//        System.out.println(t3 == t4);
//        System.out.println(st1.equals(t3));
//        System.out.println("hello".equals("Hello"));
//        System.out.println("hello".equalsIgnoreCase("Hello")); // 대소문자 구분
//
////        문자열 길이 length();
//        String str1 = "hello java world java";
//        System.out.println(str1.length());
////        index of 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        int index1 = str1.indexOf("java");
//        index1 = str1.lastIndexOf("java"); // 마지막 문자열의 index 위치
//
////        contains :  특정 문자열이 있는지 여부를 boolean 으로 리턴
//        System.out.println(str1.contains("hello"));
//        System.out.println(str1.contains("python"));

//        charAt : 특정 index의 문자(char)값을 리턴
//        String str = "abcdefghijkabcabcabc";
//        char ch1 = str.charAt(3);
////        위 문자열에 a의 개수가 몇개인지 count
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char chceck = str.charAt(i);
//            if (chceck == 'a') // str.charAt(i)=='a' // check 없이
//            {
//                count++;
//            }
//        }
//        System.out.println(count);
//
////        toCharArray() : String 뭊나열을 char배열로 리턴
//        System.out.println(Arrays.toString(str.toCharArray()));
////        toCharArray 이용하여 a가 몇개인지 count, 향상된 for문 사용
//        count = 0;
//        for (char i : str.toCharArray()) {
//            if (i == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);
//
////       문자열 더하기 : +=    //   연산은 빨라. 메모리 접근 느리다
//        String stri1 = "hello";
//        stri1 += " world";
//
////        특정 문자 제거하기 : 프로그래머스
//        String my_st = "abcdef";
//        String letter = "f";
//        String answer = "";
////        자동 형변환
//        answer += 'a';
//        class Solution {
//            public String solution(String my_st, String letter) {
//                String answer = "";
//                for (int i = 0; i < my_st.length(); i++) {
//                    if (my_st.charAt(i) != letter.charAt(0)) {
//                        answer += my_st.charAt(i);
//                    }
//                }
//
//                return answer;
//            }
//        }
//
////        subString(a,b) a이상 b 미만의 index의 문자를 잘라 리턴
//        String st1 = "hello world";
//        System.out.println(st1.substring(0, 5));
//        System.out.println(st1.substring(6, st1.length()));

//        //        특정 문자 제거하기
//        String my_st = "abcdef";
//        String letter = "f";
//        String answer = "";
//        class Solution {
//            public String solution(String my_st, String letter) {
//                String answer = "";
//                for (int i = 0; i < my_st.length(); i++) {
//                    if (my_st.substring(i,i+1).equals(letter)) {
//                        answer += my_st.substring(i,i+1);
//                    }
//                }
//                return answer;
//            }
//        }

//        가운데 글자 가져오기 - 프로그래머스
//        String s = "abcde";
//        String answer = "";
//        if(s.length()%2==0){ // 한줄로 answer=s.substring((s.length()-1)/2,s.length()/2+1);
//            answer=s.substring(s.length()/2-1,s.length()/2+1);
//        }else{
//            answer=s.substring(s.length()/2,s.length()/2+1);
//        }

//        trim(초기) strip(후기) : 문자열 양쪽 끝의 공백 제거
//        String trimSt1 = " hello world   ";
//        String trimSt2 = trimSt1.trim();
//        String trimSt2 = trimSt1.strip();

////        touppercase : 대문자로 변환 // tolowercase : 소문자로 변환
//        String s1 = "HelLo";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//
////        char --> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        char ch2 = st1.charAt(0);
//
//        replace(a,b) a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String ST2 = st1.replace("world", "java");

//        replace(a,b) replace와 동일, 정규표현식을 쓸 수 있음.
//        String st1 = "010abc123한글123"; // 숫자 알파벳 한글 등
//        String answer = "";
////        for 문 활영헤서 알파벳(소문자) 제거 amnser
//        for (int i=0;i<st1.length();i++){
//            if('a'>st1.charAt(i) || st1.charAt(i)>'z'){ // ('a'<=st1.charAt(i) && st1.charAt(i)<='z')
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        replaceAll 과 정규표현식(알아두면좋지만 외우기까지는...) 활용
//        String st1 = "010abc123ABC한글123";
////        [a-z]+  : a-z 한개 이상의 소문자 알파벳 표현하는 정규표현식
////        [A-Za-z]+ : 대소문자 포함
////        [가-힣]+ : 한글
////        [0-9]+ : 숫자
//        String answer = st1.replaceAll("[A-Za-z]+","");
//        System.out.println(answer);
//
////        String의 matches와 Pattern.matches()
//        String test = "helloA";
//        System.out.println(test.matches("[A-Za-z]+"));
//
//        boolean m1 = Pattern.matches("[0-9]+", "12345");
//        System.out.println(m1);
//
////      ^ : 정규표현식의 시작 / $ : 정규표현식의 끝 / * : 빈값포함
//        boolean m2 = Pattern.matches("^[A-Za-z]*$", "Helloworld");
//        System.out.println(m2);
//
////        문자열 다루기 : 프로그래머스
//        boolean answer = false;
//        if((s.length()==4 || s.length()==6) && s.matches("[0-9]+")){
//            answer = true;
//        }

//        전화번호 패턴 검증
//        String num = "010-123-1234";
//        boolean check = false; // Pattern.matches("^[]$", num)
//        if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", num)){
//            check = true;
//        }
//        System.out.println(check); // 입력받아서 확인하는 코드 짜보기

//        이메일 검증 : 알파벳 소문자와 숫자로 이루어진 id와 @ 소문자알파벳.com
//        String email = "hong123@naver.com";
//        boolean m3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
//        System.out.println(m3);
//
////        split : 특정 문자를 기준으로 문자열을 자르는 것. 문자열 배열을 return
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
//        System.out.println(Arrays.toString(a_arr));
//        String b = "a b c  d";
////        \s : 공백 정규표현식
//        String[] b_arr = b.split("\\s+");
//        System.out.println(Arrays.toString(b_arr));

//        isEmpty 와 null(자료타입)
//        String st1 = null;
//        String st2 = "";
////         st1 와 st2 는 equal 관계 아님
//        System.out.println(st1==st2); // 문제발생 x
//        System.out.println(st2.isEmpty()); // true
//
////        문제발생 : NullPointer Exception예외 발생
//        if(st1 != null){}
//        System.out.println(st1.isEmpty()); // false

////        join : String[] 을 하나의 String 으로 만드는 메서드
//        String[] arr ={"java", "python", "C++", "javascript"};
//        String st = String.join(" ", arr);
//        System.out.println(st);
//
////        StringBuffer
//        StringBuffer sb1 = new StringBuffer("HELLO");
//        sb1.append(" java"); // append 문자열 가장 뒤에 다른 문자열을 더하는 것.
//        sb1.append(" world");
//        String answer = sb1.toString();
//        sb1.insert(5, " python");
//        sb1.delete(17, sb1.length());
//        System.out.println(sb1);
//
////        StringBuilder : 성능이 더 좋다.
////        String += < StringBuffer < StringBuilder
////        StringBuilder는 스레드 safe x
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("hello");
//        sb2.append("\n");
//        sb2.append("world");
//        System.out.println(sb2);
//
////        StringBuilder 사용
//        String my_string= "hello";
//        int n =3; // hhheeellllllooo결과가 answer
//        StringBuilder sbtest = new StringBuilder();
//        for(int i=0; i<my_string.length();i++){
//            sbtest.append(my_string.charAt(i));
//            sbtest.append(my_string.charAt(i));
//            sbtest.append(my_string.charAt(i)); // for문 n까지
//        }
//        System.out.println(sbtest);

//        문자열 밀기 -프로그래머스
        String A = "hello";
        String B = "ohell";
        StringBuilder sb = new StringBuilder();
        int answer =0;
        int len =A.length();
        while (!sb.equals(B)){
            sb.insert(0, sb.substring(len-1, len));
            sb.delete(len,len+1);
            answer++;
            if(answer>len){
                answer = -1;
                break;
            }
        }







    }
}
