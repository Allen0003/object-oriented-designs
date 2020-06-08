package vehicles;

import enums.VehicleSize;
import packing.ParkingSpot;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    public boolean canFitinSpot(ParkingSpot spot) {
        return true;
    }
}
