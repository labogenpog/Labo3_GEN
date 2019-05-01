public abstract class Square {
    private String name;

    Square(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    public abstract void landedOn(Player p);
}
