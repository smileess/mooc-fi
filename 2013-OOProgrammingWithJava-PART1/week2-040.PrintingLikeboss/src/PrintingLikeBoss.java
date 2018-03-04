public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            amount--;
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int counter = 0;
        while (counter < amount) {
            counter++;
            System.out.print(" ");
            
        }
        
        // 40.1
    }

    public static void printTriangle(int size) {
        
        int i = 0;
        int limit = size;
        
        while (i < limit) {
            size--;
            i++;
            printWhitespaces(size);
            printStars(i);
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        
        
        int i = 0;
        int limit = height;
        while (i < limit) {
            printWhitespaces(height - 1);
            height--;
            printStars(2 * i + 1);
            i++;
                    
        }
        
        i = 0;
        
        while (i < 2) {
            printWhitespaces(limit - 2);
            printStars(3);
            i++;
        }
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
