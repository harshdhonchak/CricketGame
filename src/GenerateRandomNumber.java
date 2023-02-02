

public class GenerateRandomNumber {


    private int min =0;
    private int max;

    public GenerateRandomNumber(int max) {
        this.max = max;
    }

    public int getRandomNumber(){
        double a = Math.random()*(max-min+1)+min;

        return (int)a;
    }
}
