
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner("24:41:16");
        System.out.print("Give a string: ");
        String input = reader.nextLine();
        
        if (clockTime(input)) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
    }
    
    public static boolean isAWeekDay(String string) {
        return (string.matches("mon|wed|fri|t(ue|hu)|s(at|un)"));
    }
    
    public static boolean allVowels(String string) {
        return (string.matches("(a|e|i|o|u|ä|ö)*"));
    }
    
    public static boolean clockTime(String string) {
        return (string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]"));
    }
}
