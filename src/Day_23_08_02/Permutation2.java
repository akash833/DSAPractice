package Day_23_08_02;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        int[] nums= {1,2,3};
        permutate(new ArrayList<>(),nums,0);
    }

    public static void permutate(List<Integer> list,int[] nums,int i){
        if(i==nums.length){
            System.out.println(list);
            return;
        }

        int n = nums[i];

        for(int j = 0;j<list.size()+1;j++){
            List<Integer> li = new ArrayList<>(list);
            li.add(j,n);
            permutate(li,nums,i+1);
        }
    }
}
