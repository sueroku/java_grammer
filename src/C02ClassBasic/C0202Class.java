package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10,20));
//
////        A부서의 매출
////        20원 발생
//        MyCalculator.sumAcc(20);
//        System.out.println(MyCalculator.total);
////        30원 발생
//        MyCalculator.sumAcc(30);
//        System.out.println(MyCalculator.total);
////        40원 발생
//        MyCalculator.sumAcc(40);
//        System.out.println(MyCalculator.total);
//
////        B부서의 매출
////        클래스 메서드 호출 방식 : 클래스명.메서드();
//        MyCalculator.total = 0;
//        MyCalculator.sumAcc(10);
//        MyCalculator.sumAcc(20);
////        A부서 매출을 찾을 수 없어어ㅓ
//
////        클래스를 가지고 new 하면 객체를 만들겠어용 // static -> 클래스에 쓴다 // 객체에는 안붙어용
////        객체 : 고유의 메모리 공간 할당
//
////        객체를 사용한 회계프로그램
////        A부서 매출
//        MyCalculatorInstance m1 = new MyCalculatorInstance();
////        객체 메서드 호출 방식 : 객체명.메서드명();
//        m1.sumAcc(10);
//        m1.sumAcc(20);
//        m1.sumAcc(30);
//        MyCalculatorInstance m2 = new MyCalculatorInstance();
//        m2.sumAcc(100);
//
////        지금부터는 우리의 클래스 만들어서 우리의 객체 만들겠다.
//        C0203Person person1 = new C0203Person();
////        변수값에 직접 접근하여 값을 할당하는 방식
//        person1.name = "홍길동";
//        person1.email = "hong@naver.com";
//        person1.age =18;
//        person1.eating();
//        System.out.println("이름 : " + person1.name);
//
////        일반적인 패턴은 변수값에 직접 접근하지 않는다.
////        의도를 명확히 한 메서드를 통해 변수값을 할당하고 가져옴.
//        person1.setNickname("의적");
//        System.out.println("홍길동은 " + person1.getNickname());
//        person1.doing();




    }
}

class MyCalculator{
    static int total=0;

    static int sum(int a, int b){
        return a+b;
    }

    static void sumAcc(int a){
        total+=a;
    }

}

class MyCalculatorInstance {
    //static이 붙어있는 변수는 클래스 변수, static이 붙어 있지 않으면 객체(자기만의공간) 변수
    int total = 0;

    int sum(int a, int b) {
        return a + b;
    }

    void sumAcc(int total) { // static 붙이면 객체에는 접근 못행..
//        this 는 객체 그 자신을 의미
         this.total += total;
    } // 안붙이면 객체든 static변수든 접근 가능
}