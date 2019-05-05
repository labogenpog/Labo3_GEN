import java.util.ArrayList;

public class Board {

    // 40 squares
    private ArrayList<Square> squares = new ArrayList<Square>();

    private final static int SIZE = 40;

    Board(){
        squares.ensureCapacity( SIZE );
        // create 40 squares ordered
        squares.add(new GoSquare("Go"));
        for(int i=1; i < SIZE; ++i){
            if(i == 10){
                squares.add(new RegularSquare("Jail"));
            }
            else if(i == 4){
                squares.add(new IncomeTaxSquare("Tax Square"));
            }
            else if(i == 30){
                squares.add(new GoToJailSquare("Go to Jail", squares.get(10)));
            }
            else{
                squares.add(new RegularSquare("Case " + i ));
            }
        }
    }
    public static int getSIZE() {
        return SIZE;
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
