package abs_pac_exchand;
import abs_pac_exchand.Vehicle;
public class Honda extends Vehicle{
	 public String getModelName() {
	        return "Honda Activa";
	    }

	    public String getRegistrationNumber() {
	        return "AP10XY4567";
	    }

	    public String getOwnerName() {
	        return "Suman";
	    }

	    public int getSpeed() {
	        return 60; // current speed
	    }

	    public void cdplayer() {
	        System.out.println("CD Player is playing music in Honda scooter.");
	    }

}
