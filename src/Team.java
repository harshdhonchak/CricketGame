import java.util.ArrayList;

public class Team {

    private String name ;
    private int totalScore ;

    private ArrayList<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public Team(String name, ArrayList<Player> players) {
        this.name = name;
        this.totalScore = 0;
        this.players = players;
    }

    public void play(int over){
        int toalBalls = over * 6 ;
        int index = 0 ;
        while(toalBalls-->0 && index < players.size()){
            int runScored = players.get(index).doBatting();
            if(runScored == -1)
                  index++;
            else{
                totalScore += runScored ;
            }
        }

        this.report();

    }

    public void report(){
        System.out.println( this.name + " Scored " + this.totalScore );
        System.out.println("-------------------------------------------------------");
    }


}
