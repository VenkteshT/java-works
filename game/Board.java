package game;

public class Board {
    String board[][];
    private int count = 0;
    private int max;

    public void incrementCount() {
        this.count++;
    }

    public void decrementCount() {
        this.count--;
    }

    public int getCount() {
        return this.count;
    }

    public int maxBoardSpace() {
        return this.max;
    }

    public Board(int n) {
        this.max = n * n;
        board = new String[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = " ";
            }

        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("| " + board[i][j] + " |\t");
            }
            System.out.println("\n");
        }
    }
}
