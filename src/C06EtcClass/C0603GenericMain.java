package C06EtcClass;

import java.util.Arrays;

public class C0603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stChange(stArr,0,1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10,20,30};
        intChange(intArr,0,1);
        System.out.println(Arrays.toString(intArr));



        Person p1 = new Person();
        p1.setValue("kim");

    }


//    제네릭메서드 생성 : 반환타입 왼쪽에 <T> 선언  (타입의 약자)
//   유의점 : 제네릭은 객체 타입이 들어와야함
    static <T>void genericChange(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void stChange(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void intChange(Integer[] arr, int i, int j){
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

// 제네릭 클래스는 클래스명 앞에 <   5=>
class Person{
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

//class Person{
//    String value;
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//}