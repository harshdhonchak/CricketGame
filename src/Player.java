

public class Player {

    private String name ;
    private int totalScore ;

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

    private GenerateRandomNumber generateRandomNumber ;

    public Player(String name) {
        this.name = name;
        this.totalScore = 0;
        this.generateRandomNumber = new GenerateRandomNumber(7);
    }

    public int doBatting(){

        int result = generateRandomNumber.getRandomNumber();
        if(result == 7) {
            this.report();
            return -1;
        }

        this.totalScore += result ;
        return  result;
    }

    public void report(){
        System.out.println(this.name + " OUT AT " + this.totalScore + " !!");
    }


}
