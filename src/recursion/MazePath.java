package recursion;


//program to print all possible paths from starting cell of a matrix to ending cell
public class MazePath {
    public static void main(String[] args) {
        mazePath(0,0,3,4,"");
    }
    public static void mazePath(int currentRow, int currentColumn, int endRow, int endColumn, String ans){
        if(currentRow==endRow-1 && currentColumn==endColumn-1){
            System.out.println(ans);
        }
        if(currentRow>=endRow || currentColumn>=endColumn){
            return;
        }
        mazePath(currentRow, currentColumn+1, endRow,endColumn, ans+"H");
        mazePath(currentRow+1, currentColumn, endRow,endColumn, ans+"V");
    }
}
