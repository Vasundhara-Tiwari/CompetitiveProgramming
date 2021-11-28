package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathD2 {
    static int count = 0;
    static ArrayList<String> al = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        mazePath(0,0,row,column,"");
        for(int i=0; i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println(count);
    }
    public static void mazePath(int currentRow, int currentColumn, int endRow, int endColumn, String ans){
        if(currentRow==endRow-1 && currentColumn==endColumn-1){
            al.add(ans);
            count++;
            return;
        }
        if(currentRow >= endRow || currentColumn >= endColumn){
            return;
        }
        mazePath(currentRow + 1, currentColumn, endRow, endColumn, ans + "V");
        mazePath(currentRow, currentColumn+1, endRow,endColumn, ans+"H");
        if(currentRow==currentColumn) {
            mazePath(currentRow+1, currentColumn+1, endRow,endColumn, ans+"D");
        }
    }
}
