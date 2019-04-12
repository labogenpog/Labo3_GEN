import java.util.ArrayList;

public class Board {

    // 40 squares
    ArrayList<Square> squares = new ArrayList<Square>();

    Board(){
        squares.ensureCapacity( 40 );
        // create 40 squares ordered
        for(int i=0; i < 40; ++i){
            squares.add( new Square( "case : " + i ) );
        }

    }

    Square getSquare(Square oldLoc, char fvTot){
        return getSquareIndex( getIndex(oldLoc) + fvTot );
    }

    Square getSquareIndex (int index){
        return squares.get( index );
    }

    int getIndex(Square loc){
        return squares.indexOf(loc);
    }
}
