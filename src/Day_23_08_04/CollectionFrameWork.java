package Day_23_08_04;

import java.util.*;

public class CollectionFrameWork {
    public static void main(String[] args) {

        // Package
        // Interface
        // Class
        // Wrapper Class
        // Generics
        // Objects
        // Iterable
        // Collection
        // Arrays
        // Comparator


        //List = ?
        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(1,99);
        list.remove(2);
//        System.out.println(list);
        List<Integer> li = new ArrayList<>();
//        System.out.println(list.get(2));

        //LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.offer(56);
        ll.offer(36);
        ll.offer(46);
        System.out.println(ll);

        //Vector
        Vector<Integer> vec = new Vector<>();
        vec.add(435);
        vec.add(445);
        vec.add(445);
        vec.add(465);
        System.out.println(vec);

        //Stack
        Stack<Integer> st = new Stack<>();
        st.push(24);
        st.push(25);
        st.push(26);
        st.push(27);
        System.out.println(st.peek());

        // Queue = ?
        // PriorityQueue
        // DeQueue
        // ArrayDeque

        //  Set = ?
        // HashSet
        // LinkedHashSet
        // TreeSet
        // Map = ?
        // HashMap
        // TreeMap


    }
}
