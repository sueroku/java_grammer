package C03Inheritance;

import java.util.List;

//상속 불가
//public class C0305Others extends FinalParents
public class C0305Others {
    public static void main(String[] args) {
        AbstractDog dog = new AbstractDog();
        dog.makeSound1();
        dog.makeSound2(); // 사용은 가능 오버라이딩 불가능
////        추상클래스와 인터페이스는 구현(그 안의 메서드들)없이 객체생성 불가
//        AbstractAnimal animal = new AbstractAnimal();
//        List<Integer> myList = new List<Integer>();

    }
}

// final : 클래스에 붙이면 상속불가한 클래스 생성 - 잘 안붙임
final class FinalParents{
}

// 추상 클래스
abstract class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물소리를 냅니다.1");
    }

//    메서드 앞에 final이 붙으면 오버라이딩 불가
    final void makeSound2(){
        System.out.println("동물소리를 냅니다.2");
    }

//    abstract 키워드는 자식 클래스로 하여금 오버라이딩 강제
//    abstract 메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드가 붙어야함(부모클래스)
//    리턴타입과 매개변수만 정의
    abstract void makeSound3();

}

class AbstractDog extends AbstractAnimal{
    @Override
    void makeSound3() {
        System.out.println("멍멍3");
    }

//    @Override
//    void makeSound2(){
//        System.out.println("멍멍");
//    }

}

//인터페이스는 모든 메서드가 추상 메서드 // 구현되어있는 메서드들로만
//추상클래스 : 하나라도 추상메서드가 있으면 // 구현되있는 메서드 + 구현 안된 메서드
