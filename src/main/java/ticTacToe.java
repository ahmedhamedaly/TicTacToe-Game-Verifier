public class ticTacToe {

    // piece states: noughts ('O'), crosses ('X') and blank (' ')
    public static final char NOUGHTS = 'O';
    public static final char CROSSES = 'X';
    public static final char BLANK = ' ';

    // board[row][col]
    char[][] board;

    /**
     * CONSTRUCTOR
     * @PARAMETERS: char[row][col] board
     */
    public ticTacToe(char[][] board) {
        this.board = board;
    }

}