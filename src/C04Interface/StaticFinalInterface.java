package C04Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyInterface m1 = new MyImplements();
        m1.methodA();
//        MyImplements 에 my_constant 변수가 상속(static final)
        System.out.println(MyImplements.my_constant);
//        System.out.println(m1.my_constant); // 되긴 하는데 좋은 방법은 아니라 안쓴다.
    }
}

interface MyInterface{
//    아래 변수는 컴파일 타임에 static final 키워드가 붙음
    int my_constant = 10;
    void methodA();
}

class MyImplements implements MyInterface{
    @Override
    public void methodA() {
        System.out.println("hello world");
    }
}

// 인터페이스명 a1 = new 클래스명(); // 왜?
