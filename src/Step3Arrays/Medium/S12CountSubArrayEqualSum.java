package Step3Arrays.Medium;

import java.util.*;

public class S12CountSubArrayEqualSum {
    public static void main(String[] args) {

    }
    public int subarraySumO(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }
            int rem = sum - k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
    public int subarraySumB(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                if(sum==k){
                    count++;
                }
            }
        }

        return count;
    }
}
