public class Piece {
    private String name;
    private Square location;

    Piece(String name, Square location){
        this.name = name;
        this.location = location;
    }

    Square getLocation (){
        return location;
    }

    void setLocation(Square newLoc){
        location = newLoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
