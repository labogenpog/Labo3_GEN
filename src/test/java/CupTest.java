import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @RepeatedTest(10)
    public void testRolls(){
        Cup cup = new Cup(2);
        Cup cup2 = new Cup(10);

        cup.roll();
        cup2.roll();

        assertTrue(cup.getTotal() >= 2 && cup.getTotal() <= 12);
        assertTrue(cup2.getTotal() >= 10 && cup2.getTotal() <= 60);
    }
}