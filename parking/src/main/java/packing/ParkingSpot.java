package packing;

import enums.VehicleSize;
import vehicles.Vehicle;

//has a member variable indicating the size.
public class ParkingSpot {

    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;

    private Level level;

    public boolean isAvailable() {
        return vehicle == null;
    }


}
