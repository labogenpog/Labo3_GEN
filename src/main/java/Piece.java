public class Piece {
    String name;
    Square location;

    Piece(String name, Square location){
        this.name = name;
        this.location = location;
    }

    Square getLocation (){
        return new Square();
    }

    void setLocation(Square newLoc){
        location = newLoc;
    }

}
