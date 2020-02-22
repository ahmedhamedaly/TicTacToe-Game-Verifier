import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.Arrays;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ticTacToeTest {

    /*
    Tests the constructor
     */
    @org.junit.Test
    public void constructorTest() {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        System.out.println(
                "\n-Running Constructor-\n\n" +
                "Input board: \n" +
                Arrays.deepToString(board)
        );

        new ticTacToe(board);

        System.out.println(
                "Success!\n"
        );
    }

    /*
    Tests the current state of the game
     */
    @org.junit.Test
    public void stateTest() {
        char expected;

        char[][] board = {
                {'X', 'O', 'O'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };

        System.out.println(
                "\n-Running State-\n\n" +
                "Input board: \n" +
                Arrays.deepToString(board)
        );
        expected = 'X';

        ticTacToe game = new ticTacToe(board);
        assertEquals(expected, game.currentState());

        System.out.println(
                "Expected: " + expected + "\n" +
                "Success!" + "\n"
        );

        board = new char[][]{
                {'O', 'O', 'O'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };

        expected = 'O';

        game = new ticTacToe(board);
        assertEquals(expected, game.currentState());

        System.out.println(
                "Input board: \n" +
                Arrays.deepToString(board) + "\n" +
                "Expected: " + expected + "\n" +
                "Success!" + "\n"
        );

        board = new char[][]{
                {' ', 'O', 'O'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };

        expected = ' ';

        game = new ticTacToe(board);
        assertEquals(expected, game.currentState());

        System.out.println(
                "Input board: \n" +
                Arrays.deepToString(board) + "\n" +
                "Expected: " + expected + "\n" +
                "Success!" + "\n"
        );
    }

    /*
    Tests is winner function
     */
    @org.junit.Test
    public void isWinnerTest() {
        char[][] board = {
                {'O', 'O', 'O'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };

        System.out.println(
                "\n-Running isWinner-\n\n" +
                "Input board: \n" +
                Arrays.deepToString(board)
        );

        ticTacToe game = new ticTacToe(board);
        assertTrue(game.isWinner('O'));

        System.out.println(
                "Expected: true\n" +
                "Success!\n"
        );

        board = new char[][]{
                {'X', 'O', 'O'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };

        game = new ticTacToe(board);
        assertTrue(game.isWinner('X'));

        System.out.println(
                "Input board: \n" +
                Arrays.deepToString(board) + "\n" +
                "Expected: true\n" +
                "Success!\n"
        );
    }
}