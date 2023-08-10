package Step2Sorting.Sorting1;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {2,4,2,3,1,5,4,6,7};
        System.out.println(Arrays.toString(arr));;
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        // insertion sort
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j] > temp;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
}
