import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PieceTest {

    @Test
    void testGetName(){
        Piece piece = new Piece( "King", new Square( "Fin" ) );
        assertEquals("King", piece.getName());
    }
    @Test
    void testSetName(){
        Piece piece = new Piece( "King", new Square( "Fin" ) );
        piece.setName( "Queen" );
        assertEquals("Queen", piece.getName());
    }

    @Test
    void testGetLocation(){
        Piece piece = new Piece( "King", new Square( "Fin" ) );
        assertEquals("Fin", piece.getLocation().getName());
    }

    @Test
    void testSetLocation(){
        Square square = new Square( "random" );
        Piece piece = new Piece( "King", null );

        assertNull( piece.getLocation());

        piece.setLocation( square );
        assertEquals("random", piece.getLocation().getName());
    }


}
