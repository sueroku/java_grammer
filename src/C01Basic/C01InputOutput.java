package C01Basic;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args){
        // 출력 : System.out (콘솔)
        // println : 줄바꿈하면서 출력
        // printf : 줄바꿈없이 출력

        // 입력 : System.in (키보드입력) + Scanner(입력을 위한 클래스)
        Scanner scan = new Scanner(System.in);
        // nextLine은 입력 받은 데이터를 한줄 읽어서, String 라틴

//        String inputs = scan.nextLine();
//        System.out.println(inputs);
//        int a1 = scan.nextInt();
//        int a2 = scan.nextInt();
//        System.out.println("두수를 더한 값"+(a1+a2)+"입니당");
//        double input_do = scan.nextDouble();
//        boolean input_bo = scan.nextBoolean();

        // java밖의 시스템이므로 입출력 시스템 메모리 해제해주는 것이 좋다.
        scan.close();
    }
}
