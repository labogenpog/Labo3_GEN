import java.util.ArrayList;
import java.util.Arrays;

public class Dice {

    private char faceValue;

    void roll (){

        faceValue = (char)(6.0 * (char)(Math.random()) + 1 );
    }

    public char getFaceValue() {
        return faceValue;
    }

    public ArrayList<Integer> values(){
        ArrayList<Integer> values = new ArrayList<Integer>( Arrays.asList(1,2,3,4,5,6));

        // char values[] = {1,2,3,4,5,6};
        return values;
    }
}
