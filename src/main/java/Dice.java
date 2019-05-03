import java.util.ArrayList;
import java.util.Arrays;

public class Dice {

    private char faceValue;

    void roll (){
        int random = (int)(Math.random() * 6) + 1;
        setFaceValue((char)random);
    }

    public char getFaceValue() {
        return faceValue;
    }

    protected void setFaceValue(char faceValue) {
        this.faceValue = faceValue;
    }

    public ArrayList<Integer> values(){
        ArrayList<Integer> values = new ArrayList<Integer>( Arrays.asList(1,2,3,4,5,6));
        return values;
    }
}
