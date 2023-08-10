package Step3Arrays.Medium;

public class S4KadanesAlgorithm {
    public static void main(String[] args) {

    }

    public static int maxSubArrayO(int[] nums) {
        int n=nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0){
                sum = 0;
            }
        }

        return maxSum;
    }

    public static int maxSubArrayB(int[] nums) {
        int n=nums.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                maxSum = Math.max(maxSum,sum);
            }
        }

        return maxSum;
    }
}
