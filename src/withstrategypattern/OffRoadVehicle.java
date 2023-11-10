package withstrategypattern;

import withstrategypattern.strategy.SpecialDriveStrategy ;
public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super ( new SpecialDriveStrategy()) ;
    }
}
