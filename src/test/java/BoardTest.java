import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private static Board board;

    @BeforeEach
    void testCreateBoard() {
        board = new Board();
        assertNotNull(board.getSquareIndex( 39 ));
        // assertThrows
        try {
            assertNull(board.getSquareIndex( 40 ));
        } catch (IndexOutOfBoundsException ex){
            return ;
        }
        fail();

    }

    @Test
    void testGetSquareIndex(){
        assertEquals("case : 5", board.getSquareIndex( 5 ).getName());
    }

    @Test
    void testGetIndex(){
        Square square = new Square("case : 2");
        assertNotEquals( 2,  board.getIndex( square ));


        assertEquals( 2, board.getIndex( board.getSquareIndex( 2 ) ));
    }

    @Test
    void testGetSquare(){
        Square oldLoc = board.getSquareIndex( 5 );
        char fvTot = 10;

        Square newLoc = board.getSquare(oldLoc, fvTot);

        assertEquals("case : 15", newLoc.getName());

        // Rebouclement
        fvTot = 100;
        Square overLoc = board.getSquare(newLoc, fvTot);
        // (15 + 100) % 40 = 35
        assertEquals("case : 35", overLoc.getName());

        // Negatif
        fvTot = (char)-1;
        Square negatveLoc = board.getSquare(overLoc, fvTot);
        // (35 + 65535) & 40  => 10
        assertEquals("case : 10", negatveLoc.getName());
    }


}
