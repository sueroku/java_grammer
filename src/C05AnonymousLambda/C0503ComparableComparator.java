package C05AnonymousLambda;

import java.sql.SQLOutput;
import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {
        // 자바에서는 비료를 위한 인터페이스 2개 제공 : Comparable, Comparator
        // Comparable 인터페이스에는 CompareTo 메서드 선언
        // Comparator 인터페이스에는 compare 메서드 선언

        // String 클래스에 compareTo 내장(Comparable 구현)
        // String 클래스외에 java 많은 내장 클래스에서 Comparable 구현
//        String a = "hello";
//        String b = "world";
//        // 두 문자열의 각 자리를 순차적으로 비교
//        // 문자열의 비교는 유니코드 값의 차이를 반환
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 10;
//        System.out.println(a1.compareTo(a2));
//
//        List<String> myList = new ArrayList<String>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList); // comparable의 compareTo 메서드를 구현하여 정렬
//        System.out.println(myList);
//        Collections.sort(myList, Collections.reverseOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.naturalOrder()); // comparator을 인자값으로
//        myList.sort(Collections.reverseOrder());

        // student 객체 5개 정도 담기
        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 24));
        students.add(new Student("lee", 21));
        students.add(new Student("park", 35));
        students.add(new Student("choi", 15));
        students.add(new Student("kim", 30));
//        // 방법1. student 객체에서 Comparable을 구현 => compareTo 메서드를 오버라이딩
//        Collections.sort(students);
//        for (Student s : students) {
//            System.out.println("이름은 " + s.getName() + "나이는 " + s.getAge());
//        }

        // 방법2. Comparator를 구현한 익명 객체를 sort에 주입
        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // return o1.getAge() - o2.getAge(); // 나이로 내림차순
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Student> myComparator2 = (a, b) -> a.getAge()-b.getAge();
        students.sort(myComparator2);
        for (Student s : students) {
            System.out.println("이름은 " + s.getName() + "나이는 " + s.getAge());
        }

        // 아래 문자열을 글자 길이 순서로 내림차순 정렬하여라
        String[] stArr = {"hello","java","c++","world2"};
        Arrays.sort(stArr, Comparator.reverseOrder()); // 내림차순
        Arrays.sort(stArr, (a,b)->b.compareTo(a)); // 위랑 같은 기능
        Arrays.sort(stArr, (a,b) -> b.length() - a.length()); // 내림차순
        System.out.println(Arrays.toString(stArr));

        // [4,5],[1,2],[5,0],[3,1]
        // 위 배열이 들어간 아래 리스트를 배열에 0번째가 아닌 1번째를 기준으로 배열을 내림차순 정렬
//        만약 1번째가 같으면 0번쩨로 내림차순
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
//        myList.add(new int[]{5,0});
        myList.add(new int[]{5,5});
        myList.add(new int[]{3,1});
//        Comparator<int[]> myCop = new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[1]==o2[1]){
//                    return o2[0] - o1[0];
//                }else{
//                    return o2[1] - o1[1];
//                }
//            }
//        };
        Comparator<int[]> myCop2 = (o1, o2)->{
            if(o1[1]==o2[1]){
                   return o2[0] - o1[0];
               }else{
                    return o2[1] - o1[1];
               }
        };

//        myList.sort((a,b)->b[1]-a[1]);
//        myList.sort(myCop);
        myList.sort(myCop2);
        for(int[] a : myList){
            System.out.println(Arrays.toString(a));
        }

        String[] stArr2 =  {"hello","java","c++","world2"};
////        Queue<String> pq = new PriorityQueue<>();
//        Queue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        for(String s : stArr2){
//            pq.add(s);
//        }
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

//        글자 길이 내림차순 pq
       Queue<String> pq = new PriorityQueue<>((o1, o2)-> o2.length()-o1.length());
       for(String s : stArr2){
            pq.add(s);
        }

////       프로그래머스 가장 큰 수
//        int[] numbers = new int[]{3, 30, 34, 5, 9};
//        String answer = "";
//        List<Integer> myList2 = new ArrayList<>();
//        for(int a : numbers){
//            myList2.add(a);
//        }
//        Comparator<Integer> myCop3 = (o1, o2)->{
//            if(){
//                return
//            }else{
//                return
//            }
//        };
//        myList2.sort(myCop3);

//        쓰레드 구현 방법 :  쓰레드 상속, Runnable  주입
//        Runnable 인터페이스 주입을 통한 쓰레드 구현
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 생성한 쓰레드1입니다.");
                System.out.println("새로 생성한 쓰레드1입니다.");
            }
        }) ;
        t1.start();
        Thread t2 = new Thread(()->System.out.println("새로 생성한 쓰레드2 입니다."));
        t2.start();
        new Thread(()-> System.out.println("새로 생성한 쓰레드 3입니다.")).start();
        System.out.println("main 쓰레드 입니다");
//        Thread : 작업처리의 논리적인 주체 =>  CPU 코어 // 순서가 없다. 주체들이 동시에 실행되기 때문에
//        SPRING 기본적으로 멀티쓰레드


    }
}

// class Student implements Comparable<Student> { // 방법1
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public int compareTo(Student s) {
//        return s.getName().compareTo(this.name); // return this.name.compareTo(s.getName());
//        // return this.age - s.getAge(); // 오름차순, 반대로 빼주면 내림차순
//    }


}
