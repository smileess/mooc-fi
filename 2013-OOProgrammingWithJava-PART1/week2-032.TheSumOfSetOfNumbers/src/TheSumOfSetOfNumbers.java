
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int stoppingPoint = Integer.parseInt(reader.nextLine());
        
        int counter = 1;
        int summer = 1;
        
        while (counter < stoppingPoint) {
            counter++;
            summer += counter;
                  
        }
        
        System.out.println("Sum is " + summer);

    }
}
