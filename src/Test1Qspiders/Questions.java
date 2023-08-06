package Test1Qspiders;

import java.util.*;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {11,24,7,8,6,10,25};
        targetSum(arr,35,0,new ArrayList<>());
    }

    static void targetSum(int[] arr, int target, int i, List<Integer> list){
        if(target<0){
            return;
        }

        if(target==0){
            System.out.println(list);
            return;
        }

        for(int j=i+1;j<arr.length;j++){
            List<Integer> li = new ArrayList<>(list);
            li.add(arr[j]);
            targetSum(arr,target-arr[j],i+1,li);
        }
    }

    static void addElement(){
        int[] arr = {12,23,43,21,43,24,23,32,43};
        int[] narr = new int[arr.length+1];
        int a = 99 , idx =4;

        int i=0;
        while(i<idx){
            narr[i] =arr[i];
            i++;
        }
        narr[i] = a;
        i++;

        while(i<narr.length){
            narr[i] = arr[i-1];
            i++;
        }
        System.out.println(Arrays.toString(narr));
    }
    public static void pattern1(){
        int n = 9;
        int st = 1,sp = 0;

        for(int i=1;i<=9;i++){
            for(int j=0;j<sp;j++){
                System.out.print("  ");
            }
            for(int k=st ;k <= n+1-st ;k++){
                System.out.print(k+" ");
            }
            System.out.println();
            if(i <= n/2){
                sp++;st++;
            }else{
                sp--;st--;
            }
        }
    }

    static void pattern2(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern3(){
        int n=5;
        int st=n;
        for(int i=1;i<n*2;i++){
            for(int j=1;j<=st;j++){
                System.out.print(j+" ");
            }
            System.out.println();

            if(i < n){
                st--;
            }else{
                st++;
            }
        }
    }

    static void pattern4(){
        int n =5;
        int st = n,sp =0;
        for(int i=1;i< 2*n ;i++){
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int k=st;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
            if(i<n){
                sp++;
                st--;
            }else{
                sp--;
                st++;
            }
        }
    }
}
