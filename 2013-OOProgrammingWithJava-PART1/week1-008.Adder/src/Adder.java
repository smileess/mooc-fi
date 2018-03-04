
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numFirst = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int numSecond = Integer.parseInt(reader.nextLine());
        
        System.out.println("\nSum of the numbers: " + (numFirst + numSecond));
        
    }
}
