package Day_23_07_30;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        int[] nums = {12,90,15,18,20,22,26};
        System.out.println(binarySearchRecur(nums,0,nums.length,20));
    }

    public static List<Integer> binarySearchRecur(int[] nums,int s,int e,int target){
        List<Integer> list =new ArrayList<>();

        if(s > e){
            list.add(-1);
            return list;
        }

        int m = (s+e)/2;

        if(nums[m]==target){
            list.add(m);
            list.add(nums[m]);
            return list;
        }

        if(nums[m] < target){
            return binarySearchRecur(nums,m+1,e,target);
        }

        return binarySearchRecur(nums,s,m-1,target);
    }

    private static boolean isArraySorted(int[] nums) {

        for(int i=1;i<nums.length;i++){
            if(nums[i-1] > nums[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean isArraySortedRecur(int[] nums,int i) {
        if(i == nums.length){
            return true;
        }

        if(nums[i-1] > nums[i]){
            return false;
        }

        return isArraySortedRecur(nums,i+1);
    }


    private static int countNoOfZero(int n) {
        int c = 0;
        while(n > 0){
            int r = n%10;
            if(r==0){
                c++;
            }
            n/=10;
        }
        return c;
    }

    private static int countNoOfZeroRecur(int n,int c) {
        if(n <=0){
            return c;
        }

        if(n%10==0){
            c++;
        }

        return countNoOfZeroRecur(n/10,c);
    }

    public static int binarySearch(int[] nums,int target){

        int s = 0;
        int e = nums.length-1;

        while(s < e){

            int m = (s+e)/2;

            if(nums[m]==target){
                return m;
            }

            if(nums[m] < target){
                s = m + 1 ;
            }else{
                e = m - 1 ;
            }
        }
        return -1;
    }



    public static int reverseNum(int num){
        int sum = 0;

        while(num > 0){
            sum = sum*10 + num%10;
            num/=10;
        }

        return sum;
    }
    public static int reverseNumRecur(int num,int sum){
        if(num <= 0){
            return sum;
        }

        int s = sum*10 + num%10;

        return reverseNumRecur(num/10,s);
    }


}
