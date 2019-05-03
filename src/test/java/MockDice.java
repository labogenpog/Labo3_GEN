public class MockDice extends Dice {
    private char nextRollValue;
    protected void setNextRollValue(char nextValue){
        nextRollValue = nextValue;
    }
    @Override
    public void roll (){
        setFaceValue(nextRollValue);
    }
}
