package C01Basic;

public class C1102StackFunction2 {
    public static void main(String[] args) {
        System.out.println("메인함수 시작");
        function1(1);
        System.out.println("메인함수 끝");
    }
    static int function1(int i){
        System.out.println("function1 시작" + i);
        System.out.println("function1 끝");
        return function1(i+1);
    } // 스택메모리에 function1이 가득 쌓여서 스택오버플로우(시스템메모리상의 문제-위험) 발생
    // 재귀함수 잘못사용하면 그렇게 됩니다. 실무에서는 재귀 그래서 잘 안쓴다.
    // 깊이를 잘 모를때 끝을 모를때 재귀를 씁니다.
}
