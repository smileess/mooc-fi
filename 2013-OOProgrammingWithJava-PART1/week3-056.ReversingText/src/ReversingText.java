
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        String help = "";
        int i = text.length();
        
        while (i > 0) {
            help += text.charAt(i - 1);
            i--;
        }
        // note that method does now print anything, it RETURNS the reversed string
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
