package Step3Arrays.Medium;

import java.util.*;

public class S7RearrangeTheArray {
    public static void main(String[] args) {

    }

    public static int[] rearrangeArrayO(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int x=0, y=1;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                ans[x] = nums[i];
                x+=2;
            }else{
                ans[y] = nums[i];
                y+=2;
            }
        }

        return ans;
    }

    public  static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                negative.add(nums[i]);
            }else{
                positive.add(nums[i]);
            }
        }

        int k = 0;
        for(int i=0;i<n/2;i++){
            nums[k] = positive.get(i);
            k++;
            nums[k] = negative.get(i);
            k++;
        }

        return nums;
    }
}
