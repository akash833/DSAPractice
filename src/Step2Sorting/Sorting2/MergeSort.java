package Step2Sorting.Sorting2;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5,3,2,3,5};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int m = arr.length/2;

        int[] left =  mergesort(Arrays.copyOfRange(arr,0,m));
        int[] right = mergesort(Arrays.copyOfRange(arr,m,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i =0;
        int j=0;
        int k=0;
        int[] temp = new int[left.length+right.length];

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                temp[k] = left[i];
                i++;
            }else{
                temp[k] = right[j];
                j++;
            }
            k++;
        }

        while (i<left.length){
            temp[k] = left[i];
            i++;k++;
        }
        while (j<right.length){
            temp[k] = right[j];
            j++;k++;
        }

        return temp;
    }
}
