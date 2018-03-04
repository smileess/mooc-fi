
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        
        VehicleRegister vr = new VehicleRegister();
        
        vr.add(reg3, "milo");
        vr.add(reg2, "milo");
        vr.add(reg1, "moto");
        
        System.out.println(vr.get(reg3));

        



        // if the hashCode hasn't been overwritten, the owners are not found
    }
}
