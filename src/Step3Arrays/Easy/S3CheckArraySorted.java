package Step3Arrays.Easy;

public class S3CheckArraySorted {
    public static void main(String[] args) {

    }
    public static boolean check(int[] nums) {
        int k = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                k = i;
            }
        }

        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[(i+k)%nums.length];
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
