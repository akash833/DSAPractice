package Step3Arrays.Medium;

public class S2SortAnArrayOf012 {
    public static void main(String[] args) {

    }
    public static void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length -1;
        int k=0;
        while(k<=j){
            if(nums[k]==0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;k++;
            }else if(nums[k]==1){
                k++;
            }else if(nums[k]==2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;
            }
        }
    }
}
