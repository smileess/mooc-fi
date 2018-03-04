import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        
        String testInput = "1\n" + "HA-LOL\n" + "42\n" +
                "1\n" + "G-OWAC\n" + "101\n" +
                "2\n" + "HA-LOL\n" + "HEL\n" + "BAL\n" +
                "2\n" + "G-OWAC\n" + "JFK\n" + "BAL\n" +
                "2\n" + "HA-LOL\n" + "BAL\n" + "HEL\n" +
                "x\n" +
                "1\n" + "2\n" + "3\n" + "x\n";
        
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();
        
        UserInterface ui = new UserInterface(reader, airport);
        ui.start();
                
    }
}
