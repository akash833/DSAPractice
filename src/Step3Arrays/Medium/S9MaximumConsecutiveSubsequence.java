package Step3Arrays.Medium;

import java.util.*;

public class S9MaximumConsecutiveSubsequence {
    public static void main(String[] args) {

    }
    public int longestConsecutiveO(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int max  = 0;

        for(int i=0;i<n;i++){
            int len = 1;
            int num = nums[i];

            while(!set.contains(nums[i]+1) && set.contains(num-1)){
                len++;
                num--;
            }

            max = Math.max(len,max);
        }

        return max;
    }
    public int longestConsecutiveB(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int max  = 0;

        for(int i=0;i<n;i++){
            int len = 1;
            int num = nums[i];
            while(set.contains(num-1)){
                len++;
                num--;
            }

            max = Math.max(len,max);
        }

        return max;
    }
}
