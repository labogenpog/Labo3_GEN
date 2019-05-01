import java.util.ArrayList;
import java.util.Scanner;

public class MGame {

    // 20 rounds, following the slides
    private int roundCnt = 20;

    // between 2 and 8 players
    private int playerCount;
    private ArrayList<Player> players;
    private Dice dices[] = new Dice[2];
    private Board board = new Board() ;

    public MGame(int playerCount){
        this.playerCount = playerCount;
        players = new ArrayList<Player>(this.playerCount);

        dices[0] = new Dice();
        dices[1] = new Dice();
        for(int i = 0; i < playerCount; ++i){
            players.add(i, new Player("Joueur " + (i + 1), board, dices));
        }
    }

    public void playGame(){
        for(int i = 0; i < roundCnt; ++i){
            System.out.println("Tour " + (i + 1) + " :");
            playRound();
        }
    }
    private void playRound(){
        for(Player p : players){
            p.takeTurn();
            System.out.print( p.getName() + " : " + p.getPiece().getLocation().getName() + " | ");
        }
        System.out.println( " " );
    }

    public static void main(String args[]){
        int numberPlayers = 0;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("How many players are there ?");
            try{
                numberPlayers = in.nextInt();
                if(numberPlayers < 2 || numberPlayers > 8){
                    throw new java.lang.IllegalArgumentException();
                }
            }
            catch(Exception e){
                System.out.println("Please enter a valid input");
                in.nextLine();
                continue;
            }
            break;
        }
        MGame game = new MGame(numberPlayers);
        game.playGame();
    }
}
