package vehicles;

import enums.VehicleSize;
import packing.ParkingSpot;

public class Car extends Vehicle {

    public Car() {
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }

    public boolean canFitinSpot(ParkingSpot spot) {
        return true;
    }

}
