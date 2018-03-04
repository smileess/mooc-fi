import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        int someNumber = random.nextInt(this.numberOfSides + 1);
        
        if (someNumber > 0) {
            return someNumber;
        } else {
            return 1;
        }
        
    }
        
}
