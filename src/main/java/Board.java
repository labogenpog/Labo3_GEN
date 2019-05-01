import java.util.ArrayList;

public class Board {

    // 40 squares
    private ArrayList<Square> squares = new ArrayList<Square>();

    private final static int SIZE = 40;

    Board(){
        squares.ensureCapacity( SIZE );
        // create 40 squares ordered
        squares.add(new Square("GO"));
        for(int i=1; i < SIZE; ++i){
            squares.add( new Square( "C: " + i ) );
        }

    }

    Square getSquare(Square oldLoc, char fvTot){
        return getSquareIndex( (getIndex(oldLoc) + fvTot) % SIZE );
    }

    Square getSquareIndex (int index){
        return squares.get( index );
    }

    int getIndex(Square loc){
        return squares.indexOf(loc);
    }
}
