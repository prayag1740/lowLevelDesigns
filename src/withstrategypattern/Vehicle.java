package withstrategypattern;

import withstrategypattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject ;

    //constructor injection
    Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject ;
    }

    public void drive() {
        this.driveObject.drive() ;
    }

}
