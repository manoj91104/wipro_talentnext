package abs_pac_exchand;
import abs_pac_exchand.Logan;
import abs_pac_exchand.Ford;
public class package4 {
	 public static void main(String[] args) {
	        System.out.println("===== Hero Bike =====");
	        Hero hero = new Hero();
	        System.out.println("Model: " + hero.getModelName());
	        System.out.println("Reg No: " + hero.getRegistrationNumber());
	        System.out.println("Owner: " + hero.getOwnerName());
	        System.out.println("Speed: " + hero.getSpeed());
	        hero.radio();

	        System.out.println("\n===== Honda Bike =====");
	        Honda honda = new Honda();
	        System.out.println("Model: " + honda.getModelName());
	        System.out.println("Reg No: " + honda.getRegistrationNumber());
	        System.out.println("Owner: " + honda.getOwnerName());
	        System.out.println("Speed: " + honda.getSpeed());
	        honda.cdplayer();

	        System.out.println("\n===== Logan Car =====");
	        Logan logan = new Logan();
	        System.out.println("Model: " + logan.getModelName());
	        System.out.println("Reg No: " + logan.getRegistrationNumber());
	        System.out.println("Owner: " + logan.getOwnerName());
	        System.out.println("Speed: " + logan.speed());
	        logan.gps();

	        System.out.println("\n===== Ford Car =====");
	        Ford ford = new Ford();
	        System.out.println("Model: " + ford.getModelName());
	        System.out.println("Reg No: " + ford.getRegistrationNumber());
	        System.out.println("Owner: " + ford.getOwnerName());
	        System.out.println("Speed: " + ford.speed());
	        ford.tempControl();
	    }

}
