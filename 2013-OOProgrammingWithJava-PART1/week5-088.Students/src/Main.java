
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
//        Student student = new Student("", "");
        ArrayList<Student> students = new ArrayList<Student>();
       
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            students.add( new Student(name, studentNumber) );     
            
        }
        
        System.out.println("");
        
        for (Student student : students) {
            System.out.println(student);
        }
        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        
      
        for (Student student : students) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }

        }
        
        
//        for (item : students) {
//            System.out.println(student);
        
        
       
    }
}