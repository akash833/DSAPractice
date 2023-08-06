package Step2Sorting.Sorting1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,2,3,1,5,4,6,7};
        System.out.println(Arrays.toString(arr));;
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        // increasing Order
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
