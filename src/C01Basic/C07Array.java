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
//
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
////        int[] intArr4 = new int[];
//
//        String[] stArr = new String[5]; // 초기화시 null로 초기화
//        stArr[0] = "hello";
//        stArr[1] = "java";
////        null pointer exception 발생 가능성..
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

////        기본형 타입은 comparator 로 처리 불가
//        int[] arr = {5,1,2,7,3,1,2};
////        Arrays.sort(arr);
////        방법 1. int 오름차순 정렬 후 베열 뒤집기 // Integer[] -> comarator -> int[]에 넣기
////        방법 2. streamapi lamda를 활용한 내림차순 정렬
//        int[] answer = Arrays.stream(arr) // arr를 대상으로 stream 개체(원본의 복사본 정도로 이해하라) 생성
//                .boxed() //int요소를 integer로 형변환 시키는 메서드
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(a->a) // Integer를 int로 형변환
//                .toArray(); // 배열로 변환

////        k번째 수 : 프로그래머스
////          선택정렬 알고리즘 (최솟값 찾기, 그때그때 비교 바꾸기)
//        int[] arr = {17,20,19,25,12};
//        for(int i=0;i<arr.length-1;i++){
//            int index=i;
//            for(int j=i+1; j<arr.length;j++){
//                if(arr[index] > arr[j]){
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index]=temp;
//        }

//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1; j<arr.length;j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

////        숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때,
////        만들 수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10,20,30,40,50,60};
//        for(int i=0;i<intArr.length-1;i++){ // -1안해줘도 된다.
//            for(int j=i+1;j<intArr.length;j++){
//                System.out.println(intArr[i] + " " + intArr[j]);
//            }
//        }

////        배열의 복사 : copyOf(배열, length) 시작은 0// copyOfRange(배열,시작, 끝)
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = Arrays.copyOf(arr, 3);
//        System.out.println(Arrays.toString(newArr));
//        newArr = Arrays.copyOf(arr, 10);
//        System.out.println(Arrays.toString(newArr));
//        int[] newArr2 = Arrays.copyOfRange(arr, 1,4);
//        System.out.println(Arrays.toString(newArr2));

//        배열의 중복제거
//        int[] temp = {10,10,5,7,40,40,10,10,50}; // 나중에는 list set
////        옆숫자와 같은지 아닌지 비교 // 새로운 배열의 길이는 넉넉하게 temp길이로 // 추후 copyofrange
//        Arrays.sort(temp);
//        int[] newTemp = new int[temp.length];
//        int index = 0;
//        for(int i=0; i<temp.length;i++){
//            if(i==temp.length-1){
//                if(temp[i]!=temp[i-1]){
//                    newTemp[index] = temp[i];
//                    break;
//                }
//            }
//            if(temp[i]!=temp[i+1]){
//                newTemp[index] = temp[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(newTemp));

//        Arrays.sort(temp);
//        int[] newTemp = new int[temp.length];
//        int index = 0;
//        for(int i=0; i<temp.length;i++){
//            if(i==0 || temp[i]!=temp[i-1]){ // 처음조건부터 들어가기 때문에 다음조건이 문제가 되지 않는다.
//                newTemp[index] = temp[i];
//                index++;
//            }
//        }
//        int[] answer = Arrays.copyOfRange(newTemp,0,index);
//        System.out.println(Arrays.toString(answer));


//        프로그래머스 두개의 값 더하기
        int[] numbers = new int[]{2,1,3,4,1};
//        Arrays.sort(numbers);
//        int[] temp = new int[numbers.length*(numbers.length-1)];
//        int index =0;
//        for(int i=0; i<numbers.length;i++){
//            for(int j=i+1;j<numbers.length;j++){
//                temp[index] = numbers[i]+numbers[j];
//                index++;
//            }
//        }
//        int[] newTemp = Arrays.copyOfRange(temp,0,index);
//        Arrays.sort(newTemp);
//        int[] last = new int[newTemp.length];
//        index = 0;
//        for(int i=0; i<newTemp.length;i++){
//            if(i==0 || newTemp[i]!=newTemp[i-1]){
//                last[index] = newTemp[i];
//                index++;
//            }
//        }
//        int[] answer = Arrays.copyOfRange(last,0,index);
//        System.out.println(Arrays.toString(answer));

//        int[] temp = new int[numbers.length*(numbers.length-1)];
//        int count = 0;
//        for(int i=0;i<numbers.length-1;i++){
//            for(int j=i+1;j<numbers.length;j++){
//                temp[count] = numbers[i] + numbers[j];
//                count++;
//            }
//        }
//        temp = Arrays.copyOf(temp, count);
//        Arrays.sort(temp);
//        int[] newTemp = new int[temp.length];
//        int index = 0;
//        for(int i=0; i<temp.length;i++){
//            if(i==0 || temp[i]!=temp[i-1]){ // 처음조건부터 들어가기 때문에 다음조건이 문제가 되지 않는다.
//                newTemp[index] = temp[i];
//                index++;
//            }
//        }
//        int[] answer = Arrays.copyOfRange(newTemp,0,index); // answer = Arrays.copyOf(newTemp, index);
//        System.out.println(Arrays.toString(answer));

////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int answer =-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==8){
//                answer=i;
//                break;
//            }
//        }
//        System.out.println(answer);

////        이진검색(Binary search) - 이분탐색
////        복잡도 O(logN)
//        int[] arr = {1,3,6,8,9,11,15};
////         사전에 오름차순 정렬이 되어 있어야 이진검색 가능 //  전제 조건 : 정렬되어있어야한다.
//        System.out.println(Arrays.binarySearch(arr,15));

////        배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
////        Arrays.equals() : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));

////        2차원 배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1; // 쭈욱
////      리터럴방식으로 할당
//        int[][] arr2 = {{1,2,3},{4,5,6}};
////      2차원 배열의 출력
//        System.out.println(Arrays.deepToString(arr2));

////        2차원 가변배열 선언후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//
////        가변배열 리터럴 방식
//        int[][] arr2 = {{10,20},{10,20,30}};

////        [3][4]사이즈 배열을 선언한 뒤
////        1-12 숫자값 각 배열에 할당 후 출력
////        {{1,2,3,4},{5,6,7,8},{9,10,11,12}}
//        int n =12;
//        int[][] arr = new int[n/4][4];
//        int input = 1;
//        for(int i=0;i<n/4 ; i++){
//            for(int j=0;j<4;j++){
//                arr[i][j] = input;
//                input++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
//        int count=1;
//        int[][] temp = new int[3][4];
//        for(int i=0;i<temp.length;i++){
//            for(int j=0; j<temp[i].length;j++){
//                temp[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(temp));

////        프로그래머스 행렬의 덧셈
//        int[][] arr1 = new int[2][2];
//        int[][] arr2 = new int[2][2];
//        int[][] answer = new int[arr1.length][arr1[0].length];
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                answer[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }

////        가변배열실습 : 행의 길이 (전체 배열의 길이) 5 => {{10},{10,20},{10,20,30},{10,20,30,40},{10,20,30,40,50}}
//        int[][] arr = new int[5][];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = new int[i+1];
//            for(int j=0;j<arr[i].length;j++){
////                arr[i][j] = (j+1)*10;
//                arr[i][j] = (i+1)*10; // 문제를 잘못 받아 적었넹ㅎ
//            }
//
//        }
//        System.out.println(Arrays.deepToString(arr));





    }
//    static void test(int[] arr){
//
//    }   //  --> 이렇게 부르기도 test(new int[]{1,2,3,4});
}
