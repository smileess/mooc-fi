
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.print("Enter today's temperature: ");
            double temp = Double.parseDouble(reader.nextLine());
            if (temp >= -30 && temp <= 40) {
                Graph.addNumber(temp);
            }
        }


        // Graph is used as follows:

    }
}