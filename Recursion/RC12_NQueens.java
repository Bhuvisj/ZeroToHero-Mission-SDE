package LearningJava.DSA.Recursion.Problems;

import java.util.Arrays;

public class RC12_NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        compute(0, board);
    }
    static void compute(int row, boolean[][] board){
        if (row == board.length){
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++){
            if (isSafe(board, row, col)){
                board[row][col] = true;
                compute(row + 1,  board);
                board[row][col] = false;
            }
        }
    }
    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean col : row){
                if (col){
                    System.out.print("Q ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        // check vertical
        for (int i = 0; i < row; i++){
            if (board[i][col]){
                return false;
            }
        }
        // check diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++){
            if (board[row-i][col-i]){
                return false;
            }
        }
        // check diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++){
            if (board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
