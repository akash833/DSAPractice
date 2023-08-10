package Step3Arrays.Medium;

import java.util.Arrays;

public class S8NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int x = 0;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                x = i;
                break;
            }
        }

        int y = 0;
        for(int i = n-1 ;i>=x+1;i--){
            if(nums[i]>nums[x]){
                y = i;
                break;
            }
        }

        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
