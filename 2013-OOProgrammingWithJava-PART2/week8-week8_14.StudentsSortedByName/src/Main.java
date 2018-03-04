
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
        Student sean = new Student("sean");
        Student andy = new Student("andy");
        Student james = new Student("James");
        Student pekka = new Student("PeKka");
        List<Student> list = new ArrayList<Student>();
        list.add(sean);
        list.add(andy);
        list.add(james);
        list.add(pekka);
        // Collections.sort(list);
        System.out.println(list);
        
    }
}
