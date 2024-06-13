package C03Inheritance;

public class C0303MethodOverriding {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.sound2();

//        상속 관계일 때 부모 클래스의 타입을 자식 클래스 객체의 타입으로 지정 가능
//        Animal 클래스에 정의된 메서드만 사용가능하도록 제약 발생
        Animal mydog2 = new Dog(); // mydog2 는 new Dog 객체이다.
//        mydog2.sound2(); // 컴파일 에러 발생

//        Dog myAni = new Animal(); // 안된당.. 아예 관계가 성립이 안된당...


    }
}

class Animal{
    void sound(){
        System.out.println("동물은 소리를 냅니다.");
    }
}
class Dog extends Animal{

    void sound() {
        System.out.println("멍멍");
    }
    void sound2(){
        System.out.println("왈왈");
    }
}
class Cat extends Animal{

    void sound() {
        System.out.println("야옹");
    }
}