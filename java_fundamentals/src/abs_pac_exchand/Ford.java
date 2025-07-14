package abs_pac_exchand;
import abs_pac_exchand.Vehicle;
public class Ford extends Vehicle{
	public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "DL01JK9876";
    }

    public String getOwnerName() {
        return "Sneha";
    }

    public int speed() {
        return 120;
    }

    public int tempControl() {
        System.out.println("Temperature control (AC) is working in Ford.");
        return 22; 
    }

}
