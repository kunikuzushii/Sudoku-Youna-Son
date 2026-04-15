import java.util.ArrayList;

public class Sudoku {

    public static void main(String[] args) {

        int[][] board = new int[9][9];

        // 1–9
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            nums.add(i);
        }

        // shuffle to make random
        int shift = (int)(Math.random() * 9);

        // fill board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                int value = (pattern(r, c) + shift) % 9;
                board[r][c] = nums.get(value);
            }
        }

        printBoard(board);
    }

    
    public static int pattern(int r, int c) {
        return (r * 3 + r / 3 + c) % 9;
    }
    
    // print
    public static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {

            if (r % 3 == 0 && r != 0) {
                System.out.println("------+-------+------");
            }

            for (int c = 0; c < 9; c++) {

                if (c % 3 == 0 && c != 0) {
                    System.out.print("| ");
                }

                System.out.print(board[r][c] + " ");
            }

            System.out.println();
        }
    }
    //yay
