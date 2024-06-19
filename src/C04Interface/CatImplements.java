package C04Interface;

public class CatImplements implements AnimalInterface1 {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

//
class CatMultiImplements implements AnimalInterface1, AnimalInterface2{
//    같은 이름의 메서드가 각각의 인터페이스에 있더라도 상관없다. 결국 오버라이딩(구현)해야함. 그럼 결국 자기가 구현한 메서드를 쓸것이기때문에

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public String play(String a, String b) {
        return a + "와 "+b +"가 같이 뛰어놉니다.";
    }
}
