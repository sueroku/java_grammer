package C07ExceptionFileParsing.AuthorException;

//1.Author 엔티티
//-id, name, email, password
//-생성자에서 초기화, getter로만 구성
//2.Author컨트롤러
// 2-1.회원가입 : name, email, password 입력 -> service의 register 메서드 호출 -> service에서 Author객체 생성 -> repository에서 register완료
// 2-1.회원가입 예외처리 => service에서는 throw new 발생, controller try catch구조. (동일한 email 있는경우, 비밀번호가 5자리 이하인경우)
//        2-2.로그인 : email, password 입력 -> service의 login메서드 호출 -> service에서 해당 user가 있는지 검증 및 비밀번호 일치여부 검증
//3.AuthorService : 실질 비지니스 로직
//4.AuthorRepository :  list에 add 등 메모리 DB에 저장하는 로직

import java.util.Scanner;
import java.util.regex.Pattern;

// 컨트롤러는 while(true)
// AuthorService service = new AuthorService();
// 1. 회원가입 name, email, password 입력받아, service의 register 메서드 호출 -> service의 Author객체 생성하여 repository호출하여 register완료(list에 담기)
// 1-1. 회원가입 예외처리 -> service에서는 throw new 발생, controller try catch (동일한 email있는 경우, 비밀번호 5자리 이하인 경우)
// 2. 로그인 email, password 입력받아 service의 login 메서드 호출 -> service에서 해당 email user가 있는지 검증 (없으면 예외)

public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        Scanner sc = new Scanner(System.in);

        try {
            while (true){
                System.out.println("------------------------");
                System.out.println("서비스를 시작합니다.\n 번호를 입력하십시오 1. 회원가입 2. 로그인 3. 종료");
                int funcNum = Integer.parseInt(sc.nextLine());
                if(funcNum==1){ // 회원가입
                    System.out.println("이륾을 입력하십시오");
                    String userName = sc.nextLine();
                    System.out.println("이메일을 입력하십시오");
                    String userEmail = sc.nextLine();
                    boolean check = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", userEmail);
                    while (!check) {
                        System.out.print("형식에 맞지 않습니다.\n이메일을 다시 입력해주십시오\n이메일형식 : hoho@hoho.com\n");
                        userEmail = sc.nextLine();
                        check = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", userEmail);
                    }
                    System.out.println("비밀번호를 입력하십시오");
                    String userPass = sc.nextLine();
                    authorService.register(userName,userEmail,userPass);
                } else if (funcNum==2) { // 로그인
                    System.out.println("이메일을 입력하십시오");
                    String userEmail = sc.nextLine();
                    boolean check = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", userEmail);
                    while (!check) {
                        System.out.print("형식에 맞지 않습니다,\n이메일을 다시 입력해주십시오\n이메일형식 : hoho@hoho.com\n");
                        userEmail = sc.nextLine();
                        check = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", userEmail);
                    }
                    System.out.println("비밀번호를 입력하십시오");
                    String userPass = sc.nextLine();
                    authorService.login(userEmail,userPass);
                } else if (funcNum==3) {
                    System.out.println("서비스를 종료합니다.");
                    break;
                }else{
                    System.out.println("번호를 올바르게 입력하십시오");
                }
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
