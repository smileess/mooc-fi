import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        
        int i = text.length();
        
        System.out.print("In reverse order: ");
        
        while (i > 0) {
            System.out.print(text.charAt(i - 1));
            i--;
        }
        
        
    }
}
