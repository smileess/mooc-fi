
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to what number? ");
        int num = Integer.parseInt(reader.nextLine());
        int counter = 1;
        while (counter <= num) {
            System.out.println(counter++);
        }
        
    }
}
