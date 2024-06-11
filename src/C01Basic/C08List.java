package C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
////        list 선언 방법
////        ArrayList<타입명> 변수명 = new ArrayList<타입명>();
//        ArrayList<String> myList1 = new ArrayList<>();
//        ArrayList<String> myList2 = new ArrayList<String>();
//
////        가장일반적인 list 선언방법
////        왼쪽엔 인터페이스(기능없이 선언만 되어있는 요소), 오른쪽엔 구현체(실제 기능이 있는 실체. 이 클래스의 기능들을 사용한다.)(클래스)
//        List<String> myList3 = new ArrayList<>();
//        Queue<String> myQue = new LinkedList<>();
//
////        초기값 생성 방법 1. 하나씩 add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("c++");
//
////        초기값 생성 방법 2. 리스트를 주입
////        Arrays.asList : 배열을 리스트로 변환하는 매서드
//        String[] myArr = {"java","python","c++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(myArr)); // (myArr 말고 myList3넣을 수 있다. 괄호 안에 리스트를 넣을 수 있다.)
//        List<String> myList6 = new ArrayList<>(List.of(myArr));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myList5 = new ArrayList<>();// int는 안되지만 int[]배열은 참조형변수라 가능 타입에 넣을 수 있다. // (Arrays.asList(myArr))안된다. 형변환 이슈..!
//        for(int i :intArr){
//            myList5.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
////        System.out.println(myList);
////        add(index, 값) : 중간에 값 삽입 = 성능 떨어진다. 밀리느라 : arraylist의 특징
//        myList.add(0,30);
////        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
////        특정리스트의 요소를 모두 add
//        myList.addAll(myList2);
////        System.out.println(myList);
//
////        get 특정 위치의 요소를 반환
////        System.out.println(myList.get(0));
//
////        for문을 돌려 전체 list 출력
////        size() 리스트의 길이(개수) 반환
////        for(int i=0;i<myList.size();i++){
////            System.out.println(myList.get(i));
////        }
//
////        remove : 요소 삭제
////        1) index를 통한 삭제 2) value를 통한 삭제
//        System.out.println(myList);
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(10));
//        System.out.println(myList);

////        set(index, value) : index 위치에 value값 setting(변경)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10); myList.add(20); myList.add(30);
//        System.out.println(myList);
//        myList.set(myList.size()-1, 10);
//        System.out.println(myList);
//
////        indexOf : 특정값이 몇번째 index에 위치한지 return
////        가장 먼저 나오는 값의 index return
//        System.out.println(myList.indexOf(10));

//        전체삭제 : clear()

////        isEmpty : 값이 비었는지 안비었는지
////        contains : 특정값이 있는지 없는지 확인
//        List<Integer> list = new ArrayList<>(); // 비어있으나 null은 아니다
//        System.out.println(list.isEmpty());
////        String hello = null;
////        System.out.println(hello.isEmpty()); // 오류
//
//        list.add(10);
//        System.out.println(list.contains(20));
//
////        이중 리스트 (리스트 안에 리스트)
        List<Integer> temp1 = new ArrayList<>();
        List<List<Integer>> myList = new ArrayList<>();
        myList.add(temp1); // 변수명은 딱히 필요없다. 즉 굳이 이렇게 할 필요 없음. 리스트안 배열도 마찬가지
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(10);
//        myList.get(0).add(20);
//        myList.get(1).add(1);
//        myList.get(1).add(2);
//        System.out.println(myList);
//
////        리스트 안에 배열 // 배열 사이즈 2,3,4개 짜리 배열 3개 들어가는 것으로 add
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[]{1,2}); // new int[2]
//        myList2.add(new int[]{10,20,30});
//        myList2.add(new int[]{100,200,300,400});

////        리스트 정렬 : collections.sort() 리스트 객체.sort()
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
////        방법1. collections.sort()
//        Collections.sort((myList));
//        Collections.sort(myList, Collections.reverseOrder());
//        Collections.sort(myList, Comparator.reverseOrder());
////        방법2. 리스트객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

//        프로그래머스 n의 배수 고르기
//        int n = 3;
//        int[] numlist = {4,5,6,7,8,9,10,11,12};
//        List<Integer> myList = new ArrayList<>(Arrays.asList(numlist));
//        for(int i=0 ;i<myList.size();i++){
//            if(myList.get(i)%n !=0){
//                myList.remove(i);
//            }
//        }
//
//        int[] answer = myList.toArray(new int[myList.size()]);

////        프로그래머스 두 개 뽑아서 더하기
//        List<Integer> myList = new ArrayList<>();
//        int[] numbers = {4,5,6,7,8,9,10,11,12};
//        for(int i=0;i<numbers.length;i++){
//            for(int j=i+1;j<numbers.length;j++){
//                if(myList.contains(numbers[i]+numbers[j])){
//                    continue;
//                }else {
//                    myList.add(numbers[i]+numbers[j]);
//                }
//            }
//        }
//        Collections.sort(myList);
//        int[] answer =new int[myList.size()];
//        for(int i=0;i<myList.size();i++){
//            answer[i] = myList.get(i);
//        }
//        System.out.println(myList);

//        배열과 list 간의 변환
//        1. String 배열을 list<String>로
        String[] stArr = {"java", "python","c++"};
//        1-1. Arrays.asList
        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        1-2. for문을 통해 담기
//        1-3. streaAPI (참고만)
        List<String> stList2 = Arrays.stream(stArr).collect(Collectors.toList());

//        2. List<String>을 String 배열로 변환
//        2-1. for문을 통해 담기
//        2-2. toArray
        String[] stArr2 = stList.toArray(new String[stList.size()]);

//        3. int배열을 list<Integer>로 변환
//        3-1. for문을 통해 담기
//        3-2. streamAPI 사용
        int[] intArr = {10,20,30,40};
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());


    }
}
