import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int greatest = list.get(0);
        for (int item : list) {
            if (item > greatest) {
                greatest = item;
            }
            
        }

        
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(-90000);
        lista.add(-90002);
        lista.add(-90001);
        lista.add(-89999);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}