package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // if 조건문
//        int answer = 1234;
//        if(answer==scan.nextInt()){
//            System.out.println("문이 열렸습니다.");
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

        // 알파벳이 소문자인지 대문자인지 판별하는 프로그램
//        char inputC = scan.nextLine().charAt(0);
//        if('A'<=inputC && inputC<='Z'){
//            System.out.println("대문자입니다.");
//        } else if ('a'<=inputC && inputC<='z') {
//            System.out.println("소문자입니다.");
//        }else {
//            System.out.println("알파벳이 아닙니다.");
//        }

        // 택시요금10000 버스요금3000 킥보드2000
        //사용자에게 얼마가 있는지 물어보고 구간별로 교통수단 추천
//        int fee = scan.nextInt();
//        // if문독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면
//        // 모든 if문이 중복되어 실행될 가능성이 존재
//        if(fee>=10000){
//            System.out.println("택시를 추천합니다.");
//        }else if(fee>=3000){
//            System.out.println("버스를 추천합니다.");
//        }else if(fee >=2000){
//            System.out.println("킥보드를 추천합니다.");
//        }else {
//            System.out.println("걸어가세요.");
//        }
//        if(fee>=10000){
//            System.out.println("택시를 추천합니다.");
//        }if(10000>fee && fee>=3000){
//            System.out.println("버스를 추천합니다.");
//        }if(3000>fee && fee >=2000){
//            System.out.println("킥보드를 추천합니다.");
//        }else {
//            System.out.println("걸어가세요.");
//        }

        // 삼항연산자
//        int answer =1234;
//        String result;
//        System.out.println(result = answer==scan.nextInt()?"문이 열렸습니다.":"비밀번호 틀렸습니다.");

//      switch문 : if else if 등의 조건물을 가독성있게 표현 구문
        switch(scan.nextInt()) {
            case 1:
                System.out.println("대출업무입니다.");
                break;
            case 2:
                System.out.println("예금업무입니다.");
                break;
            case 3:
                System.out.println("적금업무입니다.");
                break;
            case 0:
                System.out.println("상담사연결입니다.");
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
                break;
        }
    }
}
