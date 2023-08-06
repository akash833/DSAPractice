package Day_23_08_03;

public class MazeProblem {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        pathAllDirection(maze,0,0,"");
    }


    static void pathAllDirection(boolean[][] maze,int r,int c,String p){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[r][c]){
            return;
        }

        maze[r][c] = true;

        if(c < maze[0].length-1){
            pathAllDirection(maze,r,c+1,p+'R');
        }
        if(r < maze.length-1){
            pathAllDirection(maze,r+1,c,p+'D');
        }
        if(r>0 && r < maze[0].length){
            pathAllDirection(maze,r-1,c,p+'U');
        }
        if(c>0 && c < maze[0].length){
            pathAllDirection(maze,r,c-1,p+'L');
        }

        maze[r][c] = false;
    }

    static void mazerun(int[][] arr, int r,int c,String p){
        if(r == arr.length-1 && c == arr[0].length-1){
            System.out.println(p);
            return;
        }

        if(arr[r][c] == 1){
            return;
        }


        arr[r][c] = 1;

        if(r < arr.length-1){
            mazerun(arr,r+1,c,p+'D');
        }
        if(c < arr[0].length-1){
            mazerun(arr,r,c+1,p+'R');
        }
        if(r > 0 && r < arr.length  ){
            mazerun(arr,r-1,c,p+'U');
        }
        if(c > 0 && c < arr[0].length  ){
            mazerun(arr,r,c-1,p+'L');
        }

        arr[r][c] = 0;
    }
}
