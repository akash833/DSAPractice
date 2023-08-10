package Step3Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class S10MissingNumber {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int N = scr.nextInt();
        int[] arr =new int[N-1];
        for(int i=0;i<N-1;i++){
            arr[i] = scr.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int []a) {
        Arrays.sort(a);
        int N = a.length;
        if(a[0]!=0){
            return 0;
        }

        for(int i=0;i<N-1;i++){
            if(a[i+1]!=a[i]+1){
                return a[i]+1;
            }
        }


        return N;
    }
}
