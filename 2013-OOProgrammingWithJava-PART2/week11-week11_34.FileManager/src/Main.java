
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();
        
        List<String> list = new ArrayList<String>();

        for (String line : t.read("src/testinput1.txt")) {
            list.add(line);
        }
        
        t.save("yo mama!", list);
    }
}
