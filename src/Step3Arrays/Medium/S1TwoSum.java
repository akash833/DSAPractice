package Step3Arrays.Medium;

import java.util.*;

public class S1TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(twoSum(arr, 4)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] nnum = Arrays.copyOf(nums,n);
        Arrays.sort(nnum);

        int i=0;
        int j= n-1;
        int n1 = 0;
        int n2 = 0;

        while(i<j){
            if(nnum[i]+nnum[j]>target){
                j--;
            }else if(nnum[i]+nnum[j]==target){
                n1 = nnum[i];n2=nnum[j];
                break;
            }else{
                i++;
            }
        }
        int idx1=-1,idx2=-1;
        for(int k=0;k<n;k++){
            if(nums[k]==n1 && idx1==-1){
                idx1=k;
            }else if(nums[k]==n2){
                idx2=k;
            }
        }

        return new int[]{idx1,idx2};
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem) && map.get(rem)!=i){
                return new int[]{i,map.get(rem)};
            }
        }

        return new int[]{};
    }
}
