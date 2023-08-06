package Day_23_08_02;

import java.util.*;

public class SubSetNum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permuatationCount(nums,new ArrayList<>(),0));
    }

    static int permuatationCount(int[] nums,List<Integer> list,int i){

        if(i==nums.length){
            return 1;
        }

        int count = 0;

        int n = nums[i];
        for(int j = 0;j< list.size() + 1 ;j++){
            List<Integer> li = new ArrayList<>(list);
            li.add(j,n);
            count += permuatationCount(nums,li,i+1);
        }

        return count;
    }

    static List<List<Integer>> permuatation(int[] nums,List<Integer> list,int i){
        List<List<Integer>> ans = new ArrayList<>();

        if(i==nums.length){
            ans.add(list);
            return ans;
        }

        int n = nums[i];
        for(int j = 0;j< list.size() + 1 ;j++){
            List<Integer> li = new ArrayList<>(list);
            li.add(j,n);
            ans.addAll(permuatation(nums,li,i+1));
        }

        return ans;
    }
}

