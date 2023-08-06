package Day_23_08_03;


public class Questions {
    public static void main(String[] args) {
        boolean[][] maze = {
                {false,false,false},
                {false,false,false},
                {false,false,false},
        };
        mazeAllDirection(maze,"",0,0);
    }



    static void mazeAllDirection(boolean[][] maze,String p ,int r,int c){
        if(r==2 && c==2){
            System.out.println(p);
            return;
        }

        if(maze[r][c]){
            return;
        }

        maze[r][c] = true;
        if(c < 2){
            mazeAllDirection(maze,p+'R',r,c+1);
        }
        if(r < 2){
            mazeAllDirection(maze,p+'D',r+1,c);
        }
        if(r > 0 && r <= 2){
            mazeAllDirection(maze,p+'U',r-1,c);
        }
        if(c > 0 && c <= 2){
            mazeAllDirection(maze,p+'L',r,c-1);
        }
        maze[r][c] = false;
    }

    public static void mazePathObstacle(boolean[][] board,String p,int r,int c){
        if(r==board.length-1 && c==board[0].length-1){
            System.out.println(p);
            return;
        }

        if(board[r][c]){
            return;
        }

        if(c < board.length-1){
            mazePathObstacle(board,p+'R',r,c+1);
        }

        if(r < board.length-1){
            mazePathObstacle(board,p+'D',r+1,c);
        }
    }




    public static void mazePath(String p,int r,int c){
        if(r==2 && c==2){
            System.out.println(p);
            return;
        }
        if(c < 3){
            mazePath(p+'H',r,c+1);
        }

        if(r < 3){
            mazePath(p+'V',r+1,c);
        }

        if(r<3 && c < 3){
            mazePath(p+'D',r+1,c+1);
        }

    }

    public static int maze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int count =0;
        count += maze(r-1,c);
        count += maze(r,c-1);

        return count;
    }
}
