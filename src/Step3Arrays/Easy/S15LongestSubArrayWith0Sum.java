package Step3Arrays.Easy;

import java.util.HashMap;

public class S15LongestSubArrayWith0Sum {
    public static void main(String[] args) {
        int[] arr = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
        System.out.println(sumZero(arr));
    }
    public static int sumZero(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == 0){
                maxLen = i+1;
            }
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                maxLen = Math.max(maxLen,i-idx+1);
            }
            map.put(sum,i);
        }

        return maxLen;
    }
}
