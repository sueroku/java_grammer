package C01Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
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
//        queue.offer("40"); // 예외가 안생겨용
//        System.out.println(queue);

//        우선순위 queue // 우선순위 : 데이터를 꺼낼 때 정렬된 데이터 pop // 데이터가 들어갔다가 나왔다가 하면서도 정렬~
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

//       프로그래머스 : 더 맵게
//        섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        Queue<Integer> scov = new PriorityQueue<>();
        for(int i:scoville){
            scov.add(i);
        }



    }
}
