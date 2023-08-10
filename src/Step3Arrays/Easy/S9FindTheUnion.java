package Step3Arrays.Easy;

import java.util.*;

public class S9FindTheUnion {
    public static void main(String[] args) {
        int[] A={1,2,3,4,6};
        int[] B={2,3,5};
        System.out.println(sortedArray(A,B));
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                if(!set.contains(a[i])){
                    list.add(a[i]);
                    set.add(a[i]);
                }
                i++;
            }else {
                if(!set.contains(b[j])){
                    list.add(b[j]);
                    set.add(b[j]);
                }
                j++;
            }
        }

        while(i<a.length ){
            if(!set.contains(a[i])){
                list.add(a[i]);
                set.add(a[i]);
            }
            i++;
        }

        while(j<b.length){
            if(!set.contains(b[j])){
                list.add(b[j]);
                set.add(b[j]);
            }
            j++;
        }

        return list;
    }
}
