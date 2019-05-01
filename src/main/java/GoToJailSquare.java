public class GoToJailSquare extends Square {

    private Square jail;

    public GoToJailSquare(String name){
        super(name);
    }

    public GoToJailSquare(String name, Square jail){
        super(name);
        this.jail = jail;
    }

    public void landedOn(Player p) {
        p.getPiece().setLocation(jail);
    }
}
