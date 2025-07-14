package abs_pac_exchand;
import abs_pac_exchand.Vehicle;
public class Hero extends Vehicle{
	 public String getModelName() {
	        return "Hero Splendor";
	    }

	    public String getRegistrationNumber() {
	        return "TS09AB1234";
	    }

	    public String getOwnerName() {
	        return "Rajesh";
	    }

	    public int getSpeed() {
	        return 80; // current speed
	    }

	    public void radio() {
	        System.out.println("Radio is turned ON in Hero bike.");
	    }

}
