import static java.lang.Math.min;

public class IncomeTaxSquare extends Square{

    public IncomeTaxSquare(String name){
        super(name);
    }

    public void landedOn(Player p) {
        int playerMoney = p.getNetWorth();
        p.reduceCash(min(200, playerMoney / 10));
    }
}
