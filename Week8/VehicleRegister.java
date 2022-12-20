package Week8;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<String>();
        for (String owner : owners.values()) {
            if (!ownersList.contains(owner)) {
                ownersList.add(owner);
            }
        }
        for (String owner : ownersList) {
            System.out.println(owner);
        }
    }
}
