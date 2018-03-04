import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int counter = number;
        
        if (number == 0) {
            System.out.println("Facorial is 1");
        } else if (number > 0) {
            while (counter > 1) {
                counter--;
                number *= counter;
            }
            System.out.println("Factorial is " + number);
        } else {
            System.out.println("Factorial is undefined.");
            
            
        }
        
        
                
               

    }
}
