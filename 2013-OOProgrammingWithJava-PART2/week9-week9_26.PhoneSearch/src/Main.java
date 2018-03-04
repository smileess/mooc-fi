
import java.util.Scanner;
import phone.UserInterface;


public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!

        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n");
        
        Scanner reader = new Scanner(System.in);
        UserInterface ui = new UserInterface(reader);
        
        
        ui.start();
    }
}
