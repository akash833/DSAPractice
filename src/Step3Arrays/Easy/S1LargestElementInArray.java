package Step3Arrays.Easy;

public class S1LargestElementInArray {
    public static void main(String[] args) {

    }
    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for(int i=1;i<n;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
