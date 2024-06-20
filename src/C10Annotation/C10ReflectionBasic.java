package C10Annotation;

public class C10ReflectionBasic {
    public static void main(String[] args) {
//        객체 생성 방법 1. 기존의 방식과 메서드 호출
        Calculator calculator = new Calculator("Samsung");
        calculator.sayHello();

//        객체 생성 방법 2. 런타임 환경에서 리플랙션 기술을 통해 객체 생성 및 메서드 호출

//        리플랙션 기술을 통해 필드 저근 및 수정





    }
}

class Calculator{
    private String name;
    Calculator(){}
    Calculator(String name){
        this.name = name.;
    }
    public void sayHello(){
        System.out.println("My name is " + this.name);
    }
}

