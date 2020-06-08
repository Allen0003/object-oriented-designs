package packing;

import packing.ParkingSpot;

public class Level {

    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0; // number of free spots
    private static final int SPOTS_PER_ROW = 10;

    public Level(int flr, int numberSpots) { }

    public int availableSpots() {
        return availableSpots;
    }

    /* Find a place to park this vehicle. Return false if failed. */
//    public boolean parkVehicle(Vehicle vehicle) { }

    /* Park a vehicle starting at the spot spotNumber, and
     * continuing until vehicle.spotsNeeded. */
//    private boolean parkStartingAtSpot(int num, Vehicle v) {
//
//    }

    /* Find a spot to park this vehicle. Return index of spot, or -1
31 * on failure. */
//    private int findAvailableSpots(Vehicle vehicle) {
//
//    }

    /* When a car was removed from the spot, increment
35 * availableSpots */
    public void spotFreed() {
        availableSpots++;
    }

}
