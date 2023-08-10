package Step3Arrays.Medium;

import java.util.*;

public class S11PrintMatrixInSpiral {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        int minr = 0;
        int minc = 0;
        int maxr = n -1;
        int maxc = m -1;
        int cnt = 0;
        int tct = n*m;
        while(cnt < tct){
            // top
            for(int i=minr,j=minc;j<=maxc && cnt < tct;j++){
                list.add(matrix[i][j]);
                cnt++;
            }
            minr++;

            // right
            for(int i=minr,j=maxc;i<=maxr && cnt < tct;i++){
                list.add(matrix[i][j]);
                cnt++;
            }
            maxc--;

            // bottom
            for(int i=maxr,j=maxc;j>=minc && cnt < tct;j--){
                list.add(matrix[i][j]);
                cnt++;
            }
            maxr--;

            // left
            for(int i=maxr,j=minc;i>=minr && cnt < tct;i--){
                list.add(matrix[i][j]);
                cnt++;
            }
            minc++;
        }

        return list;
    }
}
