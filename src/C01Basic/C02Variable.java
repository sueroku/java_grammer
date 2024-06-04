package C01Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
        // 정수 : byte(1바이트), int(4바이트), long(8바이트)
        byte a = 127;
        byte b = -128;
        // 오버플로우 또는 언더플로우 발생
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        int intA = 10;
        // long은 명시적으로 L을 붙여 long 타입이을 명시하기도 함. 거의 그렇다.
        long longA = 20L;

        // 실수 : float, double(기본)
        float f1 = 1.123f;
        double d1 = 1.123;
        //        // 부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);

        double total = 0;
        for (int i = 0; i < 1000; i++) {
            total += 0.1 * 10;
        }
        System.out.println(total / 10);

        double d2 = 0.42;
        //소수점 오차의 대안으로 Bigdecimal 클래스 사용
        // 연산할때 실수로 변환, 최종결과는 실수로 변환
        BigDecimal bd1 = new BigDecimal("1.03");
        BigDecimal bd2 = new BigDecimal("1.42");
        double result = bd1.subtract(bd2).doubleValue();
        System.out.println(result);

        // 문자형 :  char
        char m1 = '가';
        System.out.println(m1);

        //boolean :true or false
        boolean bool1 = true;
        boolean bool2 = true;
        //

        // int -> double (묵시적) 형변환 문제 없음
        int i1 = 10;
        double do1 = i1;

        // double -> int 묵시적 형변환 불가능
        // 명시적 형변황은 가능 : 소수점이 절사
        double do2 = 10.5;
        int i2 = (int)do2;

        // 형변환 관련 나눗셈 문제
        int a1=1;
        int b1=4;
        // int/int 이므로 결과값을 int로 판단하여 소수점 절사
        // 두 값 중에 한 값만이라도 double로 명시적 형변환 시켜주면 결과값 double
        int c = 1/4;
        double d = (double) 1/4;

        // 변수와 상수
        // 상수는 초기화 이후에 값이 재할당되는 것이 불가능
        // 상수는 final 키워드를 통해 표현
        //일반적으로 상수값은 대붅로
        final int A=20;
    }
}

