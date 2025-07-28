package abs_pac_exchand;
//
//public interface Vehicle {
//    default void message() {
//        System.out.println("Inside Vehicle");
//    }
//}
//
//interface FourWheeler {
//    default void message() {
//        System.out.println("Inside FourWheeler");
//    }
//}
//
//class Car implements Vehicle, FourWheeler {
//
//   
//    public void message() {
//        // You must choose which one to call explicitly
//        Vehicle.super.message();  // or use FourWheeler.super.message() if needed
//    }
//}
//
//public class interfacenew1 {
//    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.message();  // Output: Inside Vehicle
//    }
//}
//
import java.util.*;
class interfacenew1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.println(" * ");
                }
                else{
                    System.out.println(" ");
                }
            }
            
        }
    }

}