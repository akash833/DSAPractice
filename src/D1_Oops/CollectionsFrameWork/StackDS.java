package D1_Oops.CollectionsFrameWork;

import java.util.Collections;
import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.add(23);
        st.add(53);
        st.add(73);
        st.add(93);
        st.add(55);
        System.out.println(st);
        Collections.sort(st);
        System.out.println(st);
        System.out.println(st.search(23));
    }
}
