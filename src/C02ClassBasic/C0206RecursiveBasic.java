package C02ClassBasic;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
//        for문으로 1-10까지 누적합계
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(addAcc(10));

//        피보나치수열 구현 100번째
        int first = 1;
        int second = 1;
        int temp =0;
        int n = 5;
        for(int i=2;i<n;i++){
            temp = first;
            first = second;
            second = temp+first;
        }
        System.out.println(second);
        System.out.println(fi(100));
    }

    static int addAcc (int i){
        if(i==1)return 1;
        return i+addAcc(i-1);
    }

    static int fi(int i){
//        if(i==1 || i==2)return 1;
        if(i<=2)return 1;
        return fi(i-1)+fi(i-2);
    }
}
