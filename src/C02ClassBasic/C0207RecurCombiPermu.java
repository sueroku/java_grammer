package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// 재귀 만들때 반복하는 부분을 잘 살펴보고 가져다가 붙여라

public class C0207RecurCombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> answer = new ArrayList<>();
        combi(answer, new ArrayList<>(), myList, 2, 0);
        System.out.println(answer);

        List<List<Integer>> answer_p = new ArrayList<>();
        permu(answer_p, new ArrayList<>(), myList, 2, new boolean[myList.size()]);
        System.out.println(answer_p);
    }


    static void combi(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start){
        if(temp.size() == count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(answer, temp, myList, count ,i+1);
            temp.remove(temp.size()-1);
        }
    }

    static void permu(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, boolean[] visited){
        if(temp.size() == count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if(!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count,visited);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }// 한번 지나간 값은 표시해주는 boolean 배열...
    }
}


//static void perm(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start){
//    if(temp.size() == count){
//        answer.add(new ArrayList<>(temp));
//        return;
//    }
//    for(int i=start; i<myList.size(); i++){
//        if(temp.contains(myList.get(i))) continue;
//        temp.add(myList.get(i));
//        perm(answer, temp, myList, count ,start);
//        temp.remove(temp.size()-1);
//    }
//}








//
//        // 내가 하다 만 것들
//
//////        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//////       mtList로 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담기
//////        List<List<Integer>> numbers = new ArrayList<>();
//////        for(int i=0;i<myList.size()-1;i++){
//////            for(int j=i+1;j<myList.size();j++){
//////                List<Integer> temp = new ArrayList<>();
//////                temp.add(myList.get(i));
//////                temp.add(myList.get(i));
//////                numbers.add(temp);
//////            }
//////        }
////        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
////        List<List<Integer>> answer = new ArrayList<>();
////        combi(answer,new ArrayList<>(),myList,2,0);
////        System.out.println(answer);
////
////
////
////    }
////
////    static void combi(List<List<Integer>>answer, List<Integer> temp, List<Integer> myList, int count, int start){
////
////    }
//
//
//
//        //강사님
//
////        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//////        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
//////        [[1,2], [1,3] [1,4], ...]
////        List<List<Integer>> combinations = new ArrayList<>();
////        List<Integer> temp = new ArrayList<>();
////        for(int i=0; i<myList.size()-1; i++){
////            temp.add(myList.get(i));
////            for(int j=i+1; j<myList.size(); j++){
////                temp.add(myList.get(j));
////                combinations.add(temp);
////                temp.remove(myList.size()-1);
////            }
////            temp.remove(myList.size()-1);
////        }
//
//        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> answer = new ArrayList<>();
//        combinations(answer, new ArrayList<>(), myList, 2, 0);
//        System.out.println(answer);
//
//    }// main 끝
//
//    static void combinations(List<List<Integer>> answer, List<Integer>temp , List<Integer>myList, int count, int start  ){
//        if(temp.size()==count){
//            // temp값을 그대로 add할 경우 temp메모리(주소) 값이 add되므로, 모든 answer리스트에 같은 temp리스트주소 add // 나중되면 실시간으로 리스트에 있는 값(다지워진)이 들어가는거야... // 그때 그때 temp값을 새로운 리스트에 담아서 add해줘야하는거야
////            answer.add(temp); // temp로 값을 바꾸고 삭제하고 하니까~ 마지막에는 비어져 있을거야...그걸 넣으면 안되겠지... 그래서 이렇게 쓰면 안돼...
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=start; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            combinations(answer, temp, myList, count, i+1 );
//            temp.remove(temp.size()-1);
//        }
//    }// combi1 끝
//
//
//}
//
//
//
//// 강사님 코드 최종의 최종
////
////
////package C02ClassBasic;
////
////import java.util.ArrayList;
////import java.util.Arrays;
////import java.util.List;
////
////public class C0207RecurCombiPermu {
////    static List<Integer> myList;
////
////    static List<List<Integer>> answer;
////    static int count;
////    public static void main(String[] args) {
////
//////        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
////////        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
////////        [[1,2], [1,3] [1,4], ...]
//////        List<List<Integer>> combinations = new ArrayList<>();
//////        List<Integer> temp = new ArrayList<>();
//////        for(int i=0; i<myList.size()-1; i++){
//////            temp.add(myList.get(i));
//////            for(int j=i+1; j<myList.size(); j++){
//////                temp.add(myList.get(j));
//////                combinations.add(temp);
//////                temp.remove(myList.size()-1);
//////            }
//////            temp.remove(myList.size()-1);
//////        }
////
////        myList = new ArrayList<>(Arrays.asList(1,2,3,4));
////        answer = new ArrayList<>();
////        count=5;
////        combinations(new ArrayList<>(), 0);
////        System.out.println(answer);
////    }
////    static void combinations(List<Integer>temp, int start  ){
////        if(temp.size()==count){
//////            temp값을 그대로 add할경우 temp메모리값이 add되므로, 모든 answer리스트에 같은 temp리스트 add
//////            answer.add(temp);
////            answer.add(new ArrayList<>(temp));
////            return;
////        }
////        for(int i=start; i<myList.size(); i++){
////            temp.add(myList.get(i));
////            combinations(temp, i+1 );
////            temp.remove(temp.size()-1);
////        }
////    }
////}
