package vehicles;

import enums.VehicleSize;
import packing.ParkingSpot;

public class Bus extends Vehicle {
    public Bus() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitinSpot(ParkingSpot spot) {
        return true;
    }

}
