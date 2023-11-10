package withstrategypattern;

import withstrategypattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super ( new NormalDriveStrategy()) ;
    }
}
