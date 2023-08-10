package Step3Arrays.Medium;

import java.util.Arrays;

public class S5PrintMaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(printMaxSubArrayO(arr)));
    }
    public static int[] printMaxSubArrayO(int[] nums) {
        int n=nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int s = 0;
        int e = 0;
        for(int i=0;i<n;i++){
            if(sum == 0 ){
                s = i;
            }

            sum+=nums[i];
            if(maxSum<sum){
                maxSum = sum;
                e = i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(maxSum);

        return Arrays.copyOfRange(nums,s,e+1);
    }

    public static int[] printMaxSubArrayB(int[] nums) {
        int n=nums.length;
        int maxSum = Integer.MIN_VALUE;
        int s = 0;
        int e = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(maxSum<sum){
                    maxSum = sum;
                    s = i;
                    e = j;
                }
            }
        }

        return Arrays.copyOfRange(nums,s,e+1);
    }
}
