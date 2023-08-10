package Step3Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class S13LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int n = scr.nextInt();
        long k = scr.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scr.nextInt();
        }

        System.out.println(longestSubarrayWithSumK(arr,k));
    }

    public static int longestSubarrayWithSumK(int []arr, long k) {
        HashMap<Long,Integer> map = new HashMap<>();
        int maxLen = 0;
        long sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == k){
                maxLen = i+1;
            }
            long rem = sum - k;
            if(map.containsKey(rem)){
                int idx = map.get(rem);
                maxLen = Math.max(maxLen,i-idx);
            }
            map.put(sum,i);
        }

        return maxLen;
    }

    public static int longestSubarrayWithSumKO(int []arr, long k) {
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
