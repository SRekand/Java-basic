package Week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-222");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-222");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-222");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        VehicleRegister register = new VehicleRegister();

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Artoo");
        owners.put(reg3, "Jurgen");

        System.out.println("owners:");
        System.out.println(owners.get(reg1));
        System.out.println(owners.get(reg3));
        // if the hashCode hasn't been overwritten, the owners are not found

        register.printRegistrationPlates();
        register.printOwners();
    }
}
