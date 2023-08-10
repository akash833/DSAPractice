package Step3Arrays.Easy;

import java.util.*;

public class S4RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
     }
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[j]!=nums[i]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}
