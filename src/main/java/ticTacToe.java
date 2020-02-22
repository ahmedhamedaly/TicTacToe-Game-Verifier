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

    /**
     * STATE
     * @PARAMETERS: None
     * @RETURNS: char player
     */
    public char state() {
        if (isWinner(NOUGHTS))
            return NOUGHTS;
        else if (isWinner(CROSSES))
            return CROSSES;
        else
            return BLANK;
    }

    /**
     * IS WINNER
     * @PARAMETERS: char player
     * @RETURNS: boolean win
     */
    public boolean isWinner(char player) {
        return  // HORIZONTAL CHECK
                board[0][0] == player && board[0][1] == player && board[0][2] == player ||
                        board[1][0] == player && board[1][1] == player && board[1][2] == player ||
                        board[2][0] == player && board[2][1] == player && board[2][2] == player ||
                        // VERTICAL CHECK
                        board[0][0] == player && board[1][0] == player && board[2][0] == player ||
                        board[0][1] == player && board[1][1] == player && board[2][1] == player ||
                        board[0][2] == player && board[1][2] == player && board[2][2] == player ||
                        // DIAGONAL CHECK
                        board[0][0] == player && board[1][1] == player && board[2][2] == player ||
                        board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }

}