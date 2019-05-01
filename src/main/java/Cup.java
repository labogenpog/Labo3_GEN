public class Cup {

    private int numberOfDices;
    private Dice[] dices;
    private int totalValues;

    public Cup(int numberOfDices){
        this.numberOfDices = numberOfDices;
        dices = new Dice[numberOfDices];
        for(int i = 0; i < numberOfDices; ++i){
            dices[i] = new Dice();
        }
    }

    public void roll(){
        totalValues = 0;
        for(Dice d : dices){
            d.roll();
            totalValues += d.getFaceValue();
        }
    }

    public int getTotal(){
        return totalValues;
    }
}
