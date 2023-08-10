package Step3Arrays.Easy;

import java.util.*;

public class S12SingleNumber {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
            n^=nums[i];
        }
        return n;
    }

    public int singleNumber1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }

        for(int n:set){
            return n;
        }
        return 0;
    }
}
