
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int input = Integer.parseInt(reader.nextLine());
        
        System.out.print("Grade: ");
        if (input <= 29) {
            System.out.println("failed");
        } else if (input <= 34) {
            System.out.println(1);
        } else if (input <= 39) {
            System.out.println(2);
        } else if (input <= 44) {
            System.out.println(3);
        } else if (input <= 49) {
            System.out.println(4);
        } else if (input <= 60) {
            System.out.println(5);
        } else {
            System.out.println("Error.");
        
        }
               

    }
}
