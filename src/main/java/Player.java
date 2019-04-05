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

    }
}
