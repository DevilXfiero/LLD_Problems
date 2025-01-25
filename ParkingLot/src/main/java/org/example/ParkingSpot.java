package org.example;

public abstract class ParkingSpot {
    private String id;
    private ParkingSpotType type;
    private boolean isFree;
    private Vehicle vehicle;

    public ParkingSpot(String parkingSpotId, ParkingSpotType parkingSpotType) {
        this.id = parkingSpotId;
        this.type = parkingSpotType;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isFree = false;
    }

    public void freeSpot() {
        this.isFree = true;
        this.vehicle = null;
    }
}
