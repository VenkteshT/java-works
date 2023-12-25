package game;

import java.util.*;

public class Game {

    private static boolean diagonal1(String[][] board, String symbol) {
        for (int i = board.length - 1, j = 0; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j].equals(symbol) == false)
                return false;
        }
        return true;
    }

    private static boolean diagonal2(String[][] board, String symbol) {
        for (int i = 0, j = 0; i < board.length && j < board.length; i++, j++) {
            if (board[i][j].equals(symbol) == false)
                return false;
        }
        return true;
    }

    private static boolean row(String[][] board, String symbol, int row) {
        for (int j = 0; j < board.length; j++) {
            if (board[row][j].equals(symbol) == false)
                return false;
        }
        return true;
    }

    private static boolean col(String[][] board, String symbol, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col].equals(symbol) == false)
                return false;
        }
        return true;
    }

    private static boolean chieckIsPlayerWon(String[][] board, String symbol, int row, int col) {
        if (diagonal1(board, symbol) || diagonal2(board, symbol) || row(board, symbol, row)
                || col(board, symbol, col))
            return true;
        return false;
    }

    public static void isValidPosition(Board B1, String player_Name, String player_symbol, int i, int j)
            throws InvalidPositionException {

        if (i < 0 || i >= B1.board.length || j < 0 || j > B1.board.length) {
            B1.decrementCount();
            throw new InvalidPositionException();
        }
        if (B1.board[i][j].equals(player_symbol)) {
            B1.decrementCount();
            throw new InvalidPositionException();
        }
        B1.board[i][j] = player_symbol;
        B1.printBoard();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Board size: ");
        int n = sc.nextInt();
        Board B1 = new Board(n);

        Player p1 = new Player();
        Player p2 = new Player();

        String player_1_Name = p1.getName();
        String player_1_Symbol = p1.getSymbol();

        String player_2_Name = p2.getName();
        String player_2_Symbol = p2.getSymbol();

        while (true) {
            if (B1.getCount() == B1.maxBoardSpace()) {
                System.out.println("DRAW !!");
                sc.close();
                return;
            }
            try {
                int i, j;
                System.out.print(((B1.getCount() % 2 == 0) ? player_1_Name : player_2_Name) + ":");
                i = sc.nextInt();
                j = sc.nextInt();
                if (B1.getCount() % 2 == 0) {

                    isValidPosition(B1, player_1_Name, player_1_Symbol, i, j);

                    if (chieckIsPlayerWon(B1.board, player_1_Symbol, i, j)) {
                        System.out.println(player_1_Name + " Won :) !");
                        return;
                    }

                } else {

                    isValidPosition(B1, player_2_Name, player_2_Symbol, i, j);

                    if (chieckIsPlayerWon(B1.board, player_2_Symbol, i, j)) {
                        System.out.println(player_2_Name + " Won :) !");
                        return;
                    }
                }
            } catch (Exception e) {
                System.out.println("Inavlid position please enter correct position");
            }
            B1.incrementCount();
        }
    }
}
