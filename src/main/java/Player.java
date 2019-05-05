public class Player {
    private String name;
    private Board board ;
    private Cup cup;
    private Piece piece ;
    private int money;

    Player(String name, Board board){
        this(name, board, new Cup(2));
    }



    Player(String name, Board board, Cup cup){
        this.name = name;
        this.board = board;
        this.cup = cup;
        this.money = 1500;
        piece = new Piece(name+"'s token", board.getSquareIndex(0));
    }
    void takeTurn(){
        cup.roll();
        char fvTot = (char) cup.getTotal();

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare( oldLoc, fvTot );

        piece.setLocation( newLoc );
        newLoc.landedOn(this);
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void addCash(int income){ money += income; }

    public void reduceCash(int moneyLost){ money -= moneyLost; }

    public int getNetWorth(){ return money; }

}
