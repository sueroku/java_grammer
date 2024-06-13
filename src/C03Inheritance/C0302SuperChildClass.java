package C03Inheritance;

public class C0302SuperChildClass extends SuperParents{
    int a;
    int c;

    C0302SuperChildClass() {
//        super() : 부모 클래스의 생성자를 의미
//        super.변수명 : 부모 클래스의 변수명 의미
//        그래야 부모의 인스턴스 변수와 메서드를 사용할 수 있어~
        super(30);
        a = 10;
        c = 20;
    }

    public static void main(String[] args) {
        C0302SuperChildClass c1 = new C0302SuperChildClass();
        c1.display2(); // 일반적으로 자식 클래스가 우선이다.
    }


    void display2(){
        System.out.println(a); // 일반적으로 자식 클래스가 우선이다.
        System.out.println(super.a);
    }

}

class SuperParents{
    int a;
    SuperParents(int a){
        this.a = a;
    }
    void display1(){
        System.out.println("부모 클래스 입니다.");
    }
}
