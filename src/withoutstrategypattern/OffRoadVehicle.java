package withoutstrategypattern;

//drive code duplicate to that of SportsVehicle

public class OffRoadVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Special Drive capability");
    }
}
