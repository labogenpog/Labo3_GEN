public class Dice {

    char faceValue;

    void roll (){

        faceValue = (char)(6.0 * (char)(Math.random()) + 1 );
    }

    public char getFaceValue() {
        return faceValue;
    }
}
