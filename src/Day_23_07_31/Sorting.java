package Day_23_07_31;

public class Sorting {
    public static void main(String[] args) {

    }
    public static void selectionSort(int[] nums){

        int i=0;
        while(i<nums.length){
            int j = i+1;
            int min = i;
            while (j<nums.length){
                if(nums[min] > nums[j]){
                    min = j;
                }
                j++;
            }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] =temp;
            i++;
        }
    }

    public static void selectionSortRecur(int[] nums,int i,int j,int min){
        if(i==nums.length){
            return;
        }else if(j==nums.length){
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] =temp;
            i++;
            j = i;
            min = i;
        }else if(nums[min] > nums[j]){
            min = j;
        }

        selectionSortRecur(nums,i,j+1,min);
    }

    public static void bubbleSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int j = i+1;
            while (j<nums.length){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] =temp;
                }
                j++;
            }
            i++;
        }
    }

    public static void bubbleSortRecur(int[] nums,int i,int j){
        if(i==nums.length){
            return;
        }else if(j==nums.length){
            i++;
            j = i;
        }else if(nums[i] > nums[j]){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] =temp;
        }

        bubbleSortRecur(nums,i,j+1);
    }
}
