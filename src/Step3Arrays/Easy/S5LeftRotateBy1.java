package Step3Arrays.Easy;

public class S5LeftRotateBy1 {
    public static void main(String[] args) {

    }
    static int[] rotateArray(int[] arr, int n) {
        int fe = arr[0];

        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = fe;

        return arr;
    }
}
