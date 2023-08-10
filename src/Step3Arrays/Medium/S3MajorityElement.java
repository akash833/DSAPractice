package Step3Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class S3MajorityElement {
    public static void main(String[] args) {

    }

    // Moore's Voting Algorithm
    public static int majorityElementO(int[] nums) {
        int count = 0;
        int ele = nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele = nums[i];
            }
            if(nums[i]==ele){
                count++;
            }else{
                count--;
            }
        }

        return ele;
    }
    public static int majorityElementB(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return 0;
    }
    public static int majorityElementF(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return 0;
    }
}
