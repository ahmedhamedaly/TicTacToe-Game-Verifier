import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.Arrays;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ticTacToeTest {

    @org.junit.Test
    public void constructor() {
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

    @org.junit.Test
    public void state() {

    }

    @org.junit.Test
    public void isWinner() {

    }
}