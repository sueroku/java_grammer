package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        2~10까지 출력하는 while문
//        int i=2;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }

//        입력한 숫자의 구구단 단수 출력
//        while (true){
//            System.out.println("원하는 숫자를 입력하시오");
//            int i = sc.nextInt();
//            if(i==0) break;
//            int j=1;
//            while(j<10){
//                System.out.println(i + " X " + j + " = " + i*j);
//                j++;
//            }
//        }

//        1. 반복 도어락키 2. String 3.비밀번호일치시 종료 break 4. 5회불일치
//        String answer = "1234";
//        String input;
//        int count =0;
//        while (true){
//            input = sc.nextLine();
//            if(input.equals(answer)){
//                System.out.println("문이 열렸습니다.");
//                count=0;
//                break;
//            }else{
//                System.out.println("비밀번호가 틀렸습니다.");
//                count++;
//                if(count==5){
//                    System.out.println("비밀번호를 5회 틀렸습니다. 잠금");
//                    break;
//                }
//            }
//        }

//        result에 숫자 num을 반대로 뒤집은 숫자값을 넣어주세요. 나머지 이용
//        int num = sc.nextInt();
//        int result = 0;
//        while(){
//        }
//        System.out.println(result);

//        do while : 무조건 1번은 실행되는 반복문

//        for문  2~10출력
//        for(int i=2;i<11;i++){
//            System.out.println(i);
//        }

//        1~10 중에 홀수만 출력
//        for(int i=1;i<11;i++){
//            if(i%2!=0){
//                System.out.println(i);
//            }
//        }

//        1~20 짝수 모두 더하기
//        int sum=0;
//        for(int i=1 ; i<=20; i++){
//            if(i%2==0){
//                sum +=i;
//            }
//        }
//        System.out.println(sum);

//        두수의 최대공약수 구하기 24,36
//        int a=24, b=36;
//        int n;
//        int maxDivision = 0;
//        if(a<b) n=a;
//        else n=b; // int n = a>b ? a: b;
//        for(int i=1 ; i<n;i++){
//            if(a%i==0 && b%i==0){
//                maxDivision=i;
//            }
//        }
//        System.out.println(maxDivision);

//        소수구하기 // 1~24 사이 소수 구하기
//        int n =24;
//        boolean prime[] = new boolean[n+1];
//        prime[0]=prime[1]=true;
//        prime[2] = false;
//        for(int i= 3; i<=n;i++){
//            for(int j =2 ;j<i ;j++){
//                if(prime[i]){
//                    break;
//                }
//                if(i%j ==0){
//                    prime[i]=true;
//                }
//            }
//        }
//        for(int i=2; i<=n ; i++){
//            if(!prime[i]){
//                System.out.println(i);
//            }
//        }

//        1~10 까지 홀수 출력
//        for(int i=1;i<11;i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }

//        배열과 enhanced for문 (향상된 for문 - for each문)
//        int[] arr = {1,3,5,7,9};
//        for(int i=0;i<5;i++){
//            System.out.println(arr[i]); // 메모리에 직접 접근
//        }
//        for(int i:arr){
//            System.out.println(i); // 원본값의 사본이다. 변경할 수 없어어
//        }

//        System.out.println(arr); // 메모리 주소가 출력
//        System.out.println(Arrays.toString(arr));

//        일반 for문을 통한 arr값 변경 후 출력
//        for(int i=0;i<5;i++){
//            arr[i] += 10;
//            System.out.println(arr[i]); // 메모리에 직접 접근
//        }
//        향상된 for문을 통한 arr값 변경 후 출력
//        향상된 for문으로는 실제 arr값의 변경은 불가능
//        for(int i : arr){
//            i += 10;
//        }

//        자바 변수의 유효범위 : {} 위에서 쓴 i 들을 봐~
//        int num =10;
//        if(num>1){
//            int abc = 20;
//            num = 20;
//        }
//        abc =30; if문 중괄호 밖에서는 abc변수의 존재를 모름

//      다중반복문

//        라벨문 // @@ 2. loop
//        loop1:
//        for(int i=0;i<5; i++){
//            // @@ 1. boolean = false
//            for(int j=0;j<5;j++){
//                System.out.println("Hello");
//                if(j==2){ // @@ 멈추고 싶어!
//                    // @@ 1. boolean = true // break;
//                    break loop1;
//                }
//            }
//            //@@ 1. if(boolean)break;
//        }

//        라벨문 활용
        int[][] arr = {{1,2,3,4}, {4,5,6}, {7,8,9}, {10,11,12}};
        loop1:
        for(int i=0;i< arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]==11){
                    System.out.println(i + ", " + j + "에 11이 있습니다.");
                    break loop1;
                }
            }
        }
    }
}
