import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int upperBound;
    private String characters;
    private Random random;
    private String password;
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.upperBound = length;
        this.characters = "abcdefghijklmnopqrstuvwxyz";
        this.password = "";
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        
        int i = 0;
        
        password = "";
        
        while (i < this.upperBound) {
            password += characters.charAt(random.nextInt(26));
            i++;
        }
        return password;
    }
}
