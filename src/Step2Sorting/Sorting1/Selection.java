package Step2Sorting.Sorting1;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {2,4,2,3,1,5,4,6,7};
        System.out.println(Arrays.toString(arr));;
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
         }
    }
}
