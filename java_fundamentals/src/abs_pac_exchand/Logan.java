package abs_pac_exchand;
import abs_pac_exchand.Vehicle;
public class Logan extends Vehicle {
	public String getModelName() {
        return "Logan Sedan";
    }

    public String getRegistrationNumber() {
        return "MH12DE5678";
    }

    public String getOwnerName() {
        return "Anil";
    }

    public int speed() {
        return 100;
    }

    public int gps() {
        System.out.println("GPS is active in Logan.");
        return 1;
    }
	

}
