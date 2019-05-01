import java.util.ArrayList;
import java.util.Arrays;

public class Dice {

    private char faceValue;

    void roll (){
        int random = (int)(Math.random() * 6) + 1;
        faceValue = (char)random;
    }

    public char getFaceValue() {
        return faceValue;
    }

    public ArrayList<Integer> values(){
        ArrayList<Integer> values = new ArrayList<Integer>( Arrays.asList(1,2,3,4,5,6));
        return values;
    }
}
