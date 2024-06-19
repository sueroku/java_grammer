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

// 엔티티 id name email password
// 생성자에서 초기화
// getter로만 구성

public class Author {
    static long static_id = 0L;
    private long id;
    private String name;
    private String email;
    private String password;

    Author(String name, String email, String password){
        static_id +=1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
