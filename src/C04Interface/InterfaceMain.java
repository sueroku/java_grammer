package C04Interface;

import java.util.ArrayList;
import java.util.List;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements cat1 = new CatImplements();
        cat1.makeSound();
        DogImplements dog1 = new DogImplements();
        dog1.makeSound();

        AnimalInterface1 cat2 = new CatImplements(); // A~보다 C~이 기능을 더 가진다. = a의 모든걸 c는 구현해야하고 / 다른 것도 멀티구현 받을 수 있고, c 자기가 갖는..
        cat2.makeSound();
        AnimalInterface1 dog2 = new DogImplements();
        dog2.makeSound();
//        다형성 : 하나의 객체가 여러 개의 참조변수를 가질 수 있음을 의미

//        List myList = new ArrayList(); // myList. 하면 리스트에 있는 기능들이 나온다. 어레이리스트는 안나와...?
//        인터페이스, ... 이렇게 하는 이유...? 표준화를 위해. 구현은 달라도..

        CatMultiImplements cat3 = new CatMultiImplements();
        cat3.makeSound();;
        System.out.println(cat3.play("코숏","먼치킨"));
        DogMultiImplements dog3 = new DogMultiImplements();
        dog3.makeSound();
        System.out.println(dog3.play("진돗개", "시바견"));

//        AnimalInterface1 cat4 = new CatMultiImplements(); // 2의 기능 쓸 수 없어.
//        cat4.makeSound();;
//        System.out.println(cat4.play("코숏","먼치킨"));
//        AnimalInterface2 dog4 = new DogMultiImplements(); // 1의 기능 쓸 수 없어.
//        dog4.makeSound();
//        System.out.println(dog4.play("진돗개", "시바견"));


//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나,
//        익명내부클래스(그자리에서 바로 구현하는 익명 객체) 방식으로 생성 가능
        AnimalInterface1 al1 = new AnimalInterface1() {
            @Override
            public void makeSound() {
                System.out.println("hello");
            }
        };
//        객체는 무조건 클래스에서 만들어지는데...?
//        이름이 없는 클래스가 만들어졌고...?
//        즉, 익명 클래스가 만들어졌다...?
        al1.makeSound();
    }
}
