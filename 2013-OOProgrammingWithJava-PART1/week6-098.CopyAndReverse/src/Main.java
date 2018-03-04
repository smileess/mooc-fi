
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3};
        int[] copied = copy(original);


        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
    }
    
    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];   
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverseCopy = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseCopy[i] = array[j];
            j++;

        }
        return reverseCopy;
    }

    
    
    
}
