package Step3Arrays.Easy;

import java.util.Arrays;

public class S2SecondOrderElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(getSecondOrderElements(arr.length, arr)));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        int l1 = Integer.MIN_VALUE,l2 = Integer.MIN_VALUE;
        int s1 = Integer.MAX_VALUE,s2 = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(a[i] > l1){
                l2 = l1;
                l1 = a[i];
            }else if(a[i] > l2 && a[i]!=l1){
                l2 = a[i];
            }

            if(a[i] < s1){
                s2 = s1;
                s1 = a[i];
            }else if(a[i] < s2 && a[i]!=s1){
                s2 = a[i];
            }
        }

        return new int[]{l2,s2};
    }
}
