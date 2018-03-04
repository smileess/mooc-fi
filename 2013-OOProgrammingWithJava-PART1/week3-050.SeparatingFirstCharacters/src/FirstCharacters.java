import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        int i = 0;
        
        if (text.length() > 2) {
            while (i < 3) {
                System.out.println( (i + 1) + ". character: " + text.charAt(i));
                i++;
            }
        }
    }
}
