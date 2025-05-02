
package adapter2;


public class Adapter2 {

    public static void main(String[] args) {

       vehicle car = new car();
       vehicle bic = new bicyckleAdapter(new bicyckle());
       
       playwithVehicke(car);
       
        
       
        playwithVehicke(bic);
    
    }

    private static void playwithVehicke(vehicle vehicle) {
        vehicle.occelearte();
        vehicle.pushBreak();
        vehicle.scundHorn();
    }
    
}
