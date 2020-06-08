package vehicles;

import enums.VehicleSize;
import packing.ParkingSpot;

import java.util.ArrayList;

public abstract class Vehicle {

    protected VehicleSize size;
    protected ArrayList<ParkingSpot> parkingSpots =
            new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;

    public abstract boolean canFitinSpot(ParkingSpot spot);


}
