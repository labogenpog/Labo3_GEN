import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    private class MockDice extends Dice {
        private char nextRollValue;
        protected void setNextRollValue(char nextValue){
            nextRollValue = nextValue;
        }
        @Override
        public void roll (){
            setFaceValue(nextRollValue);
        }
    }

    @Test
    void playerMovesTheRightNumberOfSquares(){
        MockDice MD1 = new MockDice();
        MockDice MD2 = new MockDice();
        MD1.setNextRollValue((char) 4);
        MD2.setNextRollValue((char) 5);
        Dice[] diceArray = {MD1, MD2};
        Player JJ = new Player("Jean-Jaques", new Board(), new Cup (diceArray));
        int next_index = JJ.getBoard().getIndex(JJ.getPiece().getLocation()) + 9 %JJ.getBoard().getSIZE();
        JJ.takeTurn();
        assertEquals(next_index, JJ.getBoard().getIndex(JJ.getPiece().getLocation()));
    }
}
