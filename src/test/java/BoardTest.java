import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BoardTest {

    @Test
    void createBoardAndgetSquareByIndex(){
        Board board = new Board();

        assertNotNull(board.getSquareIndex( 39 ));
        assertEquals("case : 5", board.getSquareIndex( 5 ).getName());
    }


}
