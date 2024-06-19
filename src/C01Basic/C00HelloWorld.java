package C01Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class C00HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        // 주석처리(cnt+/)를 통해 컴파일에서 제외
////        System.out.println("Hello world2");


//        Comparator<Player> comparator = new Comparator<Player>() {
//            @Override
//            public int compare(Player a, Player b) {
//                return b.getScore() - a.getScore(); }
//        };
//        Collections.sort(players, comparator);


        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4, 5});
        myList.add(new int[]{1, 2});
        myList.add(new int[]{5, 0});
        myList.add(new int[]{3, 1});

        myList.sort((a,b)->b[1]-a[1]);


    }
}

