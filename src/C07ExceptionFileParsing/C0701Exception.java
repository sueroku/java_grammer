package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("나눗셈 프로그램입니다.");
//        System.out.println("분자입력");
//        int head = Integer.parseInt(sc.nextLine());
//        System.out.println("분모입력");
//        int tail = Integer.parseInt(sc.nextLine());
//        int result = head/tail;
//        System.out.println("나눈 결과값은 " + result);
//        예외가 발생할것으로 예상되는 코드에 try로 감싸고
//        예외가 발생했을 때 대응하는 코드를 catch에 작성한다.
//        try {
//            System.out.println("나눗셈 프로그램입니다.");
//            System.out.println("분자입력");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모입력");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head/tail;
//            System.out.println("나눈 결과값은 " + result);
////            예외는 catch 구문 순차적으로 검사
//        }catch (ArithmeticException e){ // 타입A~~tion 변수 e
//            System.out.println("분모에 0을 입력하지 마시오");
////            예외가 발생된 내역에 대한 로그를 남기기 위함
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }catch (NumberFormatException e){
////            따로 쓰는 이유 적절한 사용자에게 적절한 메세지(사유) 보내주기~
//            System.out.println("숫자를 입력하시오");
//        }catch (Exception e){
////            Exception : 모든 예외의 조상클래스
//            System.out.println("예외가 발생하였습니다.");
//        }finally {
//            System.out.println("무조건 실행");
//        }
//
//        System.out.println("thank");



//        throws : 예외처리 위임을 명시
        login("1234");

        try {
            login2("1234q");
        }catch (SQLException e){
            e.printStackTrace();
        }


    }



//    unchecked 예외에서는 throws 키워드가 예외사항을 명시하는 용도로만 사용된다.
    static void login(String password){
        if(password.length()<10){
//            throw new : 예외를 강제로 발생
//            예외는 기본적으로 메서드를 호출한 쪽에 전파
//            unchecked 예외(예외처리선택)는 예외처리가 강제되지 않음
//            checked(예외처리 필수 -> try catch)
            throw new IllegalArgumentException("비밀번호가 짧습니다.");
        }
    }


    static void login2(String password) throws SQLException{
////        방법1 직접 예외처리
//        try {
//            if(password.length()<10){
//                throw new SQLException("DB조회 상황에서 예외가 발생했습니다.");
//           }
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }

    //    방법2. 메서드를 호출한 쪽에 위임 : throws

    }


}
