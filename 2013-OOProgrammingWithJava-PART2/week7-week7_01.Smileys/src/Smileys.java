
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Milo");

    }
    
    private static void printWithSmileys(String given) {
        printBorder(given);
        printMiddle(given);
        printBorder(given);
    }
    
    public static void printBorder(String given) {
        
        int extraLoops = 6;
        
        if (itIsOdd(given.length())) {            
            extraLoops++;
        }
        
        for (int i = 0; i < given.length() + extraLoops; i++) {
            if (itIsOdd(i)) {
                System.out.print(")");
            } else {
                System.out.print(":");
            }
        }       
        System.out.println();      
    }

    public static void printMiddle(String given) {
        if (itIsOdd(given.length())) {
            System.out.println(":) " + given + "  :)");
        } else {
            System.out.println(":) " + given + " :)");
        }
      
    }
    
    public static boolean itIsOdd(int number) {
        return (number % 2 == 1);          
    }

}
