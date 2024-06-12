package C01Basic;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>(); // 일반적 선언!! 왜 링크드 리스트냐
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek()); // 값을 꺼내만 보고 그대로
//        System.out.println(myQue);
//        System.out.println(myQue.poll()); // 값을 아예 빼낸다.
//        System.out.println(myQue);




////        linkedlist와 arraylist 비교   /// 안된다...어디서 졸았지...
////        LinkedList의 add
//
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<10000;i++) {
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist의 중간삽입 :" + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i=0;i<10000;i++) {
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("arraylist의 중간삽입 :" + (endTime2-startTime2));

//
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<10000;i++) {
//            list1.get(i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist의 조회 :" + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i=0;i<10000;i++) {
//            list2.get(i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("arraylist의 조회 :" + (endTime2-startTime2));




//          얻어옴 아영님 감삼다
        // LinkedList 와 ArrayList 시간 복잡도 비교
        // LinkedList 의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list1.add(0, 10);
//        }
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("LikedList의 중간 삽입 : " + (endTime - startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list2.add(0, 10);
//        }
//
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 : " + (endTime2 - startTime2));
//
//        long startTime3 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LikedList의 조회 : " + (endTime3 - startTime3));
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list2.add(0, 10);
//        }
//
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 : " + (endTime4 - startTime4));






//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }

////        ArrayBlockingQueuq : 길이제한큐
//        Queue<String> queue = new ArrayBlockingQueue<>(3);
////        add 를 사용시 길이제한 초과시 예외 발생
////        queue.add("10");
////        queue.add("20");
////        queue.add("30");
////        queue.add("40");
//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40"); // 예외가 안생겨용~
//        System.out.println(queue);

////        매우 중요!!! 우선순위 queue // 우선순위 : 데이터를 꺼낼 때 정렬된 데이터 pop // 데이터가 들어갔다가 나왔다가 하면서도 정렬~
//        Queue<Integer> pq = new PriorityQueue<>(); // 힙 자료구조로 되어 있다 // Queue<Integer> pq = new PriorityQueue<>(뭐 안넣으면 오름차순이 기본 // 무언가comparator넣는다=?);
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll()); // 1) (매번) 전체 정렬 아니다. 2) 꺼낼 때 가장 작은 값 가져와용(정렬해야하는거 아녀? 힙이라 가능 로그2의n   전체 정렬 요소 꺼낸다=nlog2n)
//        }
//
////       프로그래머스 : 더 맵게 : 특정숫자꺼내서 제조합, 다시 삽입, 그다음 작은값 꺼내 ~~
////        섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int K = 7;
////        Queue<Integer> scov = new PriorityQueue<>();
////        for(int i:scoville){
////            scov.add(i);
////        } // 마지막 1개 남으면 2번 폴하면 에러납니다. 마지막 값 check peak()



////        Stack
//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
////        pop 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(st1.pop());
//        System.out.println(st1.peek());
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());
//
////        stack 객체 5개 정도 추가 후에 while문으로 출력
//        Stack<Integer> st2 = new Stack<>();
//        for(int i =0;i<5;i++){
//            st2.push(i+1);
//        }
//        while (!st2.isEmpty()){
//            System.out.println(st2.pop());
//        }

//       프로그래머스 : 같은 숫자는 싫어
        int []arr ={1,1,1,3,3,0,1,1,1};
//        Stack<Integer> st = new Stack<>();
//        Stack<Integer> st2 = new Stack<>();
//        for(int i=0;i<arr.length;i++){
//            st.push(arr[i]);
//        }
//        while(!st.isEmpty()){
//            st2.push(st.pop());
//            if(st.peek()==st2.peek()){}
//        }

//        올바른 괄호
//        Deque
        String s = "()()";

//       Deque
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        System.out.println(d1);
        d1.addFirst(30);
        System.out.println(d1);
        System.out.println(d1.peekFirst()); // poll
        System.out.println(d1.peekLast()); // pop
        System.out.println(d1.pollLast());
        System.out.println(d1.pollLast());
//    관련문제 : 다리를 지나는 트럭


//        문제들 좀 푸세요...
    }
}