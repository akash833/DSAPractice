package Step3Arrays.Easy;

public class S14LongestSubArrayWithSumK2 {
    public static void main(String[] args) {

    }

    public static int longestSubarrayWithSumK(int []arr, long k) {
            int n =arr.length;
            int maxLen = 0;
            int left = 0;
            int right = 0;
            long sum = arr[0];

            while(right<n){
                while(left<=right && sum>k){
                    sum-=arr[left];
                    left++;
                }
                if(sum==k){
                    maxLen = Math.max(maxLen, right-left+1);
                }

                right++;
                if(right<n){
                    sum+=arr[right];
                }

            }

            return maxLen;
        }
}
