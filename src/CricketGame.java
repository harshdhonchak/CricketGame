public class CricketGame {


    private Team team1 ;
    private Team team2 ;

    private int overs ;

    private int tossResult ;

    public CricketGame(Team team1, Team team2, int overs) {
        this.team1 = team1;
        this.team2 = team2;
        this.overs = overs;
    }

    public void toss(){
        GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber(1);
        this.tossResult = generateRandomNumber.getRandomNumber();

        if(this.tossResult == 0){
            System.out.println(team1.getName() + " WON BATTING !! " + team2.getName() + " WILL BE BOWLING -_-");
        }
        else{
            System.out.println(team2.getName() + " WON BATTING !! " + team1.getName() + " WILL BE BOWLING -_-");
        }

    }

    public void play(){
        if(tossResult == 0){
            startGame(team1,team2);

        }
        else
            startGame(team2 , team1);

        if(team1.getTotalScore() > team2.getTotalScore()){
            System.out.println(team1.getName() + " WINS :)");
        }
        else if(team1.getTotalScore() < team2.getTotalScore()){
            System.out.println(team2.getName() + " WINS :)");
        }
        else{
            System.out.println("DRAW MATCH !!");
        }

    }

    public void startGame(Team team1 , Team team2){
        team1.play(overs);
        team2.play(overs);
    }


}
