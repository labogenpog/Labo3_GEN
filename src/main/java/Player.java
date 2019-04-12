public class Player {
    String name;
    Board board ;
    Dice dices [];
    Piece piece ;

    Player(String name, Board board, Dice[] dices){
        this.name = name;
        this.board = board;
        this.dices = dices;
        piece = new Piece(name+"' token", board.getSquareIndex(0));
    }

    void takeTurn(){
        char fvTot = 0;
        // Joue les dés
        for(Dice dice : dices){
            dice.roll();
            fvTot += dice.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare( oldLoc, fvTot );

        piece.setLocation( newLoc );

    }
}
