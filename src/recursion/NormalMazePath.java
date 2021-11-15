package recursion;

public class NormalMazePath {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        mazePath(maze, 0, 0);
    }
    public static void mazePath(boolean[][] maze, int currentRow, int currentColumn){
        if(currentRow==maze.length-1 && currentColumn== maze[0].length-1){
            maze[currentRow][currentColumn] = true;
            displayMatrix(maze);
            maze[currentRow][currentColumn] = false;
            return;
        }
        if(currentRow < 0 || currentColumn < 0 || currentRow>= maze.length || currentColumn >= maze[0].length || maze[currentRow][currentColumn] == true){
            return;
        }
        int[] row = {0,1,0,-1};
        int[] column = {1,0,-1,0};
        maze[currentRow][currentColumn] = true;
        for (int i=0; i<column.length; i++){
            mazePath(maze, currentRow+row[i], currentColumn+column[i]);
        }
        maze[currentRow][currentColumn]=false;
    }
    public static void displayMatrix(boolean[][] maze){
        for (int i=0; i< maze.length; i++){
            for (int j=0; j< maze[0].length; j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
