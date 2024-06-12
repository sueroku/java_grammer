package C02ClassBasic;

public class C0201MethodPractice {
    public static boolean[] prime_b;
    public static void main(String[] args) {
        System.out.println(prime(10));
    }
//    어떤 숫자 값이 소수인지 아닌지 판별하는 메서드 생성
//    리턴타입 boolean 매개변수는 int 숫자
    public static boolean prime(int n){
        prime_b = new boolean[n+2];

        prime_b[0] = prime_b[1] = true; // 소수가 아니면 true

        for(int i=2;i<Math.sqrt(n);i++){
            if(prime_b[i]){ // 소수면 false
                continue;
            }

            for(int j=i*i;j<prime_b.length;j=j+i){
                prime_b[j] = true;
            }
        }

        return prime_b[n];
    }
}
