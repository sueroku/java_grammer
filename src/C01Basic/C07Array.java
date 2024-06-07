package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
////        배열 표현식1 : 리터럴 방식
//        int[] intArr1 = {1, 2, 3, 4, 5};
//
////        배열 표현식2 : 배열 선언 후 할당
//        int[] intArr2 = new int[5];
//        ;
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); //0으로 초기화
//        for (int i = 0; i < intArr2.length; i++) {
//            System.out.println(intArr2[i]);
//        }
//        for (int i : intArr2) {
//            System.out.println(i);
//        }
//
////        표현식3
//        int[] intArr3 = new int[]{1, 2, 3, 4};
//
////      표현식4 : 불가 -> 배열의 길이는 사전에 지정되어야함
////        int[] intArr4 new int[];
//
//        String[] stArr = new String[5];
//        stArr[0] = "hello";
//        stArr[1] = "java";
////        null pointer exception
////        System.out.println(stArr[2].length());
//
//        String[] stArr2 = new String[5];
//        Arrays.fill(stArr2, ""); // 값을 한꺼번에 세팅
//
////        85, 65, 90인 int 배열 선언, 총합, 평균
//        int[] arr = {85,65,90};
//        int sum =0;
//        for(int i=0; i<arr.length ; i++){
//            sum +=arr[i];
//        }
//        int avg = sum/arr.length;

//        최대값 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0], min = arr[0]; // 가장 작은 값 Integer.MIN_VALUE // 가장 큰 값 Integer.MAX_VALUE
//        for(int i=1; i<arr.length;i++){
//            if(max<arr[i]){max=arr[i];}
//            if(min>arr[i]){min=arr[i];}
//        }
//        System.out.println(max + " " + min);

////        배열의 자리 바꾸기
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0]= arr[1];
//        arr[1] = temp;
//
//        int[] arr2 = {10,20,30,40,50};
//        for(int i=0; i<arr2.length-1;i++){
//            temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
////        새로운 배열에 위 arr 뒤집은 값 세팅
//        int[] arr2 = new int[arr.length];
//        for(int i=0;i<arr.length;i++){ // length :  객체 메서드
//            arr2[i] = arr[arr.length-i-1];
//        }
//        System.out.println(Arrays.toString(arr2));

//        숫자 뒤집기 int num =1234;
//        문자배열로 만들고 문자열로 합해서 문자열로 출력
//        int num = 1234;
//        String number = Integer.toString(num);
//        StringBuilder sb = new StringBuilder(number);
//        String result = sb.reverse().toString();
//        System.out.println(result);

//        정렬
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr); // 오름차순 정렬이 기본  // 클래스 메소드
//
////        문자정렬
////        아스키 코드 기준으로 --> 대문자가 소문자보다 아스키코드 숫자가 낮다.
//        String[] fruits = {"banana", "apple","cherry","Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
////        문자열의 index순서로 비교
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//
////        내림차순
//        String[] st_arr = {"hello", "hi", "bye","goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());

//        기본형 타입은 comparator 로 처리 불가
        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr);
//        방법 1. int 오름차순 정렬 후 베열 뒤집기 // Integer[] -> comarator -> int[]에 넣기
//        방법 2. streamapi lamda를 활용한 내림차순 정렬
        int[] answer = Arrays.stream(arr) // arr를 대상으로 stream 개체(원본의 복사본 정도로 이해하라) 생성
                .boxed() //int요소를 integer로 형변환 시키는 메서드
                .sorted(Comparator.reverseOrder())
                .mapToInt(a->a) // Integer를 int로 형변환
                .toArray(); // 배열로 변환



    }
//    static void test(int[] arr){
//
//    }   //  --> 이렇게 부르기도 test(new int[]{1,2,3,4});
}
