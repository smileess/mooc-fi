import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers:");
        
        int input = 0;
        int sum = 0;
        int counter = -1;
        int even = 0;
        int odd = -1;
        
        while (input != -1) {
            sum += input;
            counter++;
            input = Integer.parseInt(reader.nextLine());
            
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }  
        }
        
        double average = 1.0 * sum / counter;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);        
        System.out.println("Even numbers: " + even);        
        System.out.println("Odd numbers: " + odd);

    }
}
