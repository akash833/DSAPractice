package D1_Oops.Iterator;

import java.util.*;

public class CreateItrator {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(22);
        a.add(30);
        a.add(43);
        a.add(43);
        a.add(40);
        a.add(44);
        a.add(10);
        a.add(20);
        a.add(53);
        ListIterator<Integer> li = a.listIterator();
        while(li.hasNext()){
            System.out.print(li.next()+", ");
        }
        System.out.println();
        while(li.hasPrevious()){
            System.out.print(li.previous()+", ");
        }
        System.out.println();
//        while(li.hasNext()){
//            if(li.next()%7 ==0 ){
//                li.add(10);
//            }
//        }
//
//        System.out.println(a);
//        while(li.hasPrevious()){
//            int value = li.previous();
//            if(value%2==0){
//                li.set(value+1);
//            }
//        }
//        System.out.println(a);

        while(li.hasNext()){
            int value = li.next();
            if(value%10==0){
                li.set(value+5);
                li.previous();
                System.out.println(li.previous());
                li.next();
            }
        }
        System.out.println(a);
    }
}
