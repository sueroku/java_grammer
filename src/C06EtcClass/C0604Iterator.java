package C06EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C0604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

//        enhanced for 문 : 원본 변경 불가
        for(String a: myList){
            System.out.println(a);
        }

//        iterator는 참조하고 있는 원본데이터 삭제 가능 -> remove
        Iterator<String> iters = myList.iterator();
        while (iters.hasNext()){
            System.out.println(iters.next());
        }

        Iterator<String> iters2 = myList.iterator();
        while (iters2.hasNext()){
            if(iters2.next().equals("banana")){
                iters2.remove();
            }
        }
        System.out.println(myList);




    }
}
