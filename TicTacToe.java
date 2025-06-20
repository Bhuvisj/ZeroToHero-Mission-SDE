package LearningJava;

import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // initialize 3 x 3 Board with empty characters ' '
        char[][] board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }

        int size = 0;
        char player = 'X';
        boolean gameOver = false;

        while (!gameOver){
            // if board has no space to put value, the Game is Tie
            if (size == 9) {
                System.out.println("Game Draw!!");
                break;
            }

            display(board);

            System.out.print("Player " + player + " Enter : ");
            int row = in.nextInt();
            int col = in.nextInt();

            if (board[row][col] == ' '){
                board[row][col] = player;
                size++;
                gameOver = haveWon(board, player);
                if (gameOver){
                    System.out.println("Player " + player + " has Won!!");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid Move!!");
            }
        }
        display(board);
    }

    static void display(char[][] board){
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

    static boolean haveWon(char[][] board, char player){
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) return true;
        }
        for (int i = 0; i < board.length; i++){
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
}
