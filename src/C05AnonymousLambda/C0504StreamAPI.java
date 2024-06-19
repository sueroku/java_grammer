package C05AnonymousLambda;


// 람다표현식 (화살표함수) // 대세. 다 이렇게 쓴다.
// 1. 익명객체
// 2. 함수형 프로그래밍(streamAPI) // 성능은 떨어지나 왜 쓰는가

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamAPI {
    public static void main(String[] args){
//        int[] arr = {20,10,4,12};
////        전통적인 방식의 데이터 접근방식 :  메모리 주소로 접근(원본)
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
////        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력(stream(arr))에 따른 출력(프린트출력이아니라)만 존재 (사실상 복제본 사용)
////        java에서 함수형 프로그래밍을 지원하기 위한 라이브러리가 streamAPI
////        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
////      생성부분            최종연산
////      int[] arr2 = Arrays.stream(arr).map(a->a*10).toArray();
////        함수형 프로그래밍 in java 이슈(구조적 문제점 존재)들 ---- 타입 : 참조형 변수, 기본형 변수 // List<String> 제네릭
////       강사님 왈 : 읽을 줄만 알면 되지 않을까...
//
////        스트림의 생성   :   .stream()
//        String[] stArr = {"HTML", "CSS", "JAVA","PYTHON"};
////        stream<클래스명> : 제네릭타입으로 stream객체가 생성
//        Stream<String> stream1 = Arrays.stream(stArr);
//        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        Stream<String> stream2 = stList.stream();
//
//        int[] intArr = {10,20,30,40,50};
////        기본형 자료는 별도의 stream 제공
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        Stream<Integer> stream4 = myList.stream();
////        int가 아니라 Integer이기 때문에 Intstream 은 사용 불가
////        IntStream stream5 = myList.stream(); // 형변환에 이슈가 생긴다.

////        stream 변환(중개연산) : filter, map, sorted distinct, limit
//        String[] stArr = {"HTML", "CSS", "JAVA","PYTHON"};
////        filter : 특정 기준으로 대상을 filtering하는 것. Stream<String>을 반환
////        제네릭의 타입소거문제 발생 (참조변수 스트림변환의 경우 포함)
////        제네릭의 타입소거란 제네릭타입을 런타임시점에는 제거하는 것을 의미한다.
////        그래서, 타입이 소거된 stream 객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야함(타입캐스팅)
//        String[] newStArr = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(a->new String[a]); // a변수에는 strea요소의 개수
////                            여기부터     Stream<String>         여기까지   변환할때 꺽쇠부분이 사라짐 그래서 타입을 몰라.. string을 다시 선언해줘야한다.
////        List<String> myList = new ArrayList<>(); // 런타임시 <String>(제네릭)이 사라진다.
////        String myArr = myList.toArray(); // 오류
////        메소드 참조 방식(매개변수가 추론가능할때 생략하는 형식(1개라든가...?)) : 클래스::메서드    // new 는 생성자 호출 키워드 // 메서드는 아니지만 메서드 취급
//        String[] newStArr2 = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(String[]::new);
////        Arrays.stream(stArr).forEach(System.out::println); // 같아용
////        Arrays.stream(stArr).forEach(a-> System.out.println(a)); 같아용 변수 하나라 생략
//
////        int[] intArr = {10,20,30,40,50};
//        int[] intArr = {10,10,30,40,50};
//        int[] newIntArr = Arrays.stream(intArr).filter(a->a<=30).toArray();
////                        여기부터 얘는 IntStream이라        여기까지      그래서 괜찮
////        distinct  :  중복제거
//        int[] newIntArr2 = Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newIntArr));
//        System.out.println(Arrays.toString(newIntArr2));
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//
////        map :  기존의 스트림을 조작하여 새로운 스트림 반환
//        int[] newMapArr = Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr));

////        홀수 찾기
//        int[] arr1 = {1,2,3,4,5,6};
////        홀수만 담은 배열 생성 : filter
//        int[] newOdd = Arrays.stream(arr1).filter(a->a%2!=0).toArray();
////        홀수만 담은 배열의 값을 제곱한 새로운 배열 생성 : filter, map
//        int[] newOdd2 = Arrays.stream(arr1).filter(a->a%2!=0).map(a->a*a).toArray();
//        int newInt = Arrays.stream(arr1).filter(a->a%2!=0).map(a->a*a).sum();
//        System.out.println(Arrays.toString(newOdd));
//        System.out.println(Arrays.toString(newOdd2));
//
////        홀수만 담은 배열의 값을 제곱한 새로운 배열 내림차순 정렬 생성 : filter, map, sorted
//        int[] arr4 = Arrays.stream(arr1).filter(a->a%2!=0).map(a->a*a).sorted().toArray(); // 왜 컴페러터가 안되는가?
//
////        mapToInt : intstream형태로 변환해주는 map
//        String[] stArr = {"HTML","CSS","JAVASCRIPT","JAVA"};
////        각 문자열의 길이를 담은 새로운 INT배열 생성
//        int[] intArr5 = Arrays.stream(stArr).mapToInt(a->a.length()).toArray();
//        int[] intArr6 = Arrays.stream(stArr).mapToInt(a-> a.length()).limit(3).toArray();;
//        System.out.println(Arrays.toString(intArr6));
//
//
////        스트림의 소모 -> sum(합계), redus:누적합게연산! foreach(출력)
//        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach((a-> System.out.println(a)));
//        int intArrSum = Arrays.stream(intArr).sum();
////        optional 객체 : 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체
//        int intArrMax = Arrays.stream(intArr).max().getAsInt();
//        int intArrMin = Arrays.stream(intArr).min().getAsInt();
//        int intArrCount = (int)Arrays.stream(intArr).count();
////        reduce(초기값, 연산식);
//        int allMultiply = Arrays.stream(intArr).reduce(1,(a,b)->a*b);
//        int allAdd = Arrays.stream(intArr).reduce(0,(a,b)->a+b);
//        System.out.println(allMultiply);
//        System.out.println(allAdd);
//        String[] stArr2 = {"hello","java","world"};
//        String stAllAdd = Arrays.stream(stArr2).reduce("",(a,b)->a+b);
//        System.out.println(stAllAdd);
//
////        findFirst : 첫번째 요소 반환
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim", 20));
//        students.add(new Student("lee", 35));
//        students.add(new Student("park", 22));
//        students.add(new Student("choi", 32));
//
////         나이가 30이 넘는 학생 중에 첫번째 index값을 가지는 학생 객체 생성
//        Student s1 = students.stream().filter(a->a.getAge()>=30).findFirst().get();
//
////        student 객체 실습
////        1) 모든 객체의 평균 나이 : int에 결과 담기
////        2) 가장 나이 어린 사람 찾기 : Student에 담아주기
////        3) 30대의 이름을 String배열에 담기
//        int avgAge = (int)students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
//        Student s2 = students.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
//        String[] thirty = students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(a->new String[a]);

////        Optional 객체 : 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현 // 조건문이나 그런걸로 따질 수도 있는데.. 까먹을 수도 있잖아!
////        ofNullable : null이 있을 수도 있는 경우에 Optional객체를 생성하는 메서드 // 심리적 이중장치라고 할까나 // 옵셔널이 보이면 없을 수도 있구나 하세요
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1 = null;
////        System.out.println(opt1.get().compareTo("hello"));
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("hello"));
//        }else {
//            System.out.println("값이 없습니다.");
//        }
//        if(st1!=null){
//            System.out.println("hello");
//        }else {
//            System.out.println("값이 없습니다.");
//        }

//        Optional 객체 생성 3가지 방법
        Optional<String> opt1 = Optional.empty();
        Optional<String> opt2 = Optional.of("hello"); // null이 못들어감
//        Optional<String> opt3 = Optional.ofNullable("hello"); // null이 들어갈 수 있음
        Optional<String> opt3 = Optional.ofNullable(null);

//        Optional 객체 처리 방법 (굳이따지자면) 4가지
//        방법1. isPresent() 확인 후 get()
        if(opt3.isPresent()){
            System.out.println(opt3.get().length());
        }else {
            System.out.println("없당");
        }
//        방법2. orElse() : 값이 있으면 있는 값 return, 없으면 지정값 return
        System.out.println(opt3.orElse("").length());
//        방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수(매개변수) 실행
        System.out.println(opt3.orElseGet(()->new String("")).length());
//        방법4. orElseThrow() : 가장 중요! 값이 있으면 있는 값 return, 없으면 지정된 예외 강제 발생
//        개발에서 예외를 사용자에게 적절한 메세지 전달 목적으로 강제 발생시키는 경우도 존재 (예외를 무조건 안주는게 아니다 / 예외는 안좋은게 아니에용)
        System.out.println(opt3.orElseThrow(()->new NoSuchElementException("값이 없습니다.")).length());


        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("kim1", 21));
        students.add(new Student("kim2", 23));
        students.add(new Student("kim3", 25));
//        방법1
        OptionalDouble answer = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average();
        if(answer.isPresent()){
            System.out.println(answer.getAsDouble());
        }else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer);
//        방법2
        double answer2 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));






    }
}
