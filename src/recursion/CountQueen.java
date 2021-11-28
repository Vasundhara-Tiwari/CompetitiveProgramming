package recursion;

import java.util.Scanner;

public class CountQueen {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        countQueen(new boolean[n][n], 0, 0, 0, n);
        System.out.println(count);
    }
    public static void countQueen(boolean[][] board, int row, int column, int placedQueen, int totalQueen) {
        if (totalQueen == placedQueen) {
            count++;
            return;
        }
        if (column == board[row].length) {
            row = row + 1;
            column = 0;
        }
        if (row == board.length) {
            return;
        }
        if (isSafe(board, row, column)) {
            board[row][column] = true;
            countQueen(board, row, column + 1, placedQueen + 1, totalQueen);																						// box
            board[row][column] = false;
        }
        countQueen(board, row, column + 1, placedQueen, totalQueen);
    }
    public static boolean isSafe(boolean[][] board, int row, int column) {
        for (int i = 0; i < row; i++) {
            if (board[i][column]) {
                return false;
            }
        }
        for (int j = 0; j < column; j++) {
            if (board[row][j]) {
                return false;
            }
        }
        int r1 = row;
        int c1 = column;
        while (r1 >= 0 && c1 >= 0) {

            if (board[r1][c1]) {
                return false;
            }
            r1--;
            c1--;
        }
        r1 = row;
        c1 = column;
        while (r1 >= 0 && c1 < board[0].length) {
            if (board[r1][c1]) {
                return false;
            }
            r1--;
            c1++;
        }
        return true;
    }
}
