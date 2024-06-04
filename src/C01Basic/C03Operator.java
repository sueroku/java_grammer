package C01Basic;

public class C03Operator {
    public static void main(String[] args) {
        // 산술연산자 : 사칙연산
        int n1 = 8, n2 = 3;
        // * : 곱셈  / : 나눗셈(몫)  %  : 나머지

        // 증감연산자 : ++ --

        // 비교연산자 == != > >= 등
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println(ch1==ch2); // false

        // 논리연산자 && || !
        int num1=10, num2=20;
        boolean result1=num1>5 && num1<20;
        System.out.println(result1);
        result1=num2<10 || num2<30;
        System.out.println(result1);

        // 비트연산자 & | ^ ~

        // 시프트연산 : <<(왼쪽이동) >>(오른쪽이동)
        // 왼쪽으로 한칸이동한다는 의미는 2를 곱한다는 의미
        // 오른쪽으로 한칸이동한다는 의미는 2를 나눈다는 의미


    }
}