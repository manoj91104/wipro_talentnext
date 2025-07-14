package abs_pac_exchand;

public interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {

    @Override
    public void message() {
        // You must choose which one to call explicitly
        Vehicle.super.message();  // or use FourWheeler.super.message() if needed
    }
}

public class interfacenew1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.message();  // Output: Inside Vehicle
    }
}

