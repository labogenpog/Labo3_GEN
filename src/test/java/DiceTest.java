import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {

    @RepeatedTest(10)
    public void testRollValue(){

        Dice dice = new Dice();

        dice.roll();

        int value = dice.getFaceValue();
        boolean test = dice.values().contains( value );
        assertTrue(test);

    }
}
