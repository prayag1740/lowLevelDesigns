import withstrategypattern.GoodsVehicle;
import withstrategypattern.Vehicle;

public class Main {
    public static void main(String[] args) {


        Vehicle gv = new GoodsVehicle() ;
        gv.drive();
    }
}