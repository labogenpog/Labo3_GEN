import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    void testGetName(){
        Square square = new RegularSquare("TestSquare");
        assertEquals("TestSquare", square.getName());
    }
}
