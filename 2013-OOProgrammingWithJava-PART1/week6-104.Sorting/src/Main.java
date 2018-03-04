
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        
        int smallest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            
            if (smallest > array[i]) {
                smallest = array[i];
            }
            
        }
        
        return smallest;
        
    }
    
    public static int indexOfTheSmallest(int[] array) {
        

        return indexOfTheSmallestStartingFrom(array, 0);
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        
        int indexOfSmallest = index;
        int smallest = array[index];

        for (int i = index; i < array.length; i++) {
            
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;

    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int value1 = array[index1];
        int value2 = array[index2];
        
        array[index1] = value2;
        array[index2] = value1;
        
    }
    
    public static void sort(int[] array) {
        
        
        
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));

        }
    }

}
