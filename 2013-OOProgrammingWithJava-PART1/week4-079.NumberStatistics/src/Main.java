import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evens = new NumberStatistics();
        NumberStatistics odds = new NumberStatistics();
        
        
        int input = 0;
        System.out.println("Type numbers:");
        
        while (true) {

            input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                evens.addNumber(input);
            } else {
                odds.addNumber(input);
            }
            stats.addNumber(input);
        }
        
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evens.sum());
        System.out.println("sum of odd: " + odds.sum());
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
