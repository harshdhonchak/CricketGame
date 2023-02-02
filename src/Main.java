import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Player player1 = new Player("Rahul");
        Player player2 = new Player("Sachin");
        Player player3 = new Player("Gautam");
        Player player4 = new Player("Virat");

        ArrayList<Player> team1 = new ArrayList<>();
        team1.add(player1);
        team1.add(player2);
        ArrayList<Player> team2 = new ArrayList<>();
        team2.add(player3);
        team2.add(player4);

        Team india = new Team("India",team1);
        Team england = new Team("England",team2);

        int overs = 20 ;


        CricketGame cricketGame = new CricketGame(india,england,20);
        cricketGame.toss();
        cricketGame.play();



    }
}