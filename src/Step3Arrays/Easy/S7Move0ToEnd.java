package Step3Arrays.Easy;

public class S7Move0ToEnd {
    public static void main(String[] args) {

    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;

        for(int i=1;i<n;i++){
            int j = i-1;
            int curr = nums[i];
            for(j = i-1;j>=0 && nums[j]==0;j--){
                nums[j+1] = nums[j];
            }
            nums[j+1] = curr;
        }
    }
}
