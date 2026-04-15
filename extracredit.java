import java.util.ArrayList;
import java.util.Scanner;

public class extracredit {

    public static void main(String[] args) {

        int[][] solved = new int[9][9];
        int[][] puzzle = new int[9][9];

        // list 1-9
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            nums.add(i);
        }

        // shift
        int shift = (int)(Math.random() * 9);

        // answer key
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                solved[r][c] = nums.get((pattern(r, c) + shift) % 9);
            }
        }

        // unfortunately had to google how to do this 
        copyBoard(solved, puzzle);

        makePuzzle(puzzle);

        playGame(puzzle, solved);
    }

    // pattern
    public static int pattern(int r, int c) {
        return (r * 3 + r / 3 + c) % 9;
    }

    // copy
    public static void copyBoard(int[][] from, int[][] to) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                to[r][c] = from[r][c];
            }
        }
    }

    // blank space generation
    public static void makePuzzle(int[][] board) {
        for (int i = 0; i < 30; i++) {
            int r = (int)(Math.random() * 9);
            int c = (int)(Math.random() * 9);
            board[r][c] = 0;
        }
    }

    // game loop logic and updates the board if you get it correct
    public static void playGame(int[][] puzzle, int[][] solved) {

        Scanner input = new Scanner(System.in);

        while (true) {

            printBoard(puzzle);

            System.out.print("Row (0-8): ");
            int r = input.nextInt();

            System.out.print("Col (0-8): ");
            int c = input.nextInt();

            System.out.print("Value (1-9): ");
            int val = input.nextInt();

            if (solved[r][c] == val) {
                puzzle[r][c] = val;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }

            System.out.print("Continue? (1=yes / 0=no): ");
            if (input.nextInt() == 0) break;
        }
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

                if (board[r][c] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[r][c] + " ");
                }
            }

            System.out.println();
        }
    }
}
//yipee
