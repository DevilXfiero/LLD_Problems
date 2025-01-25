package org.example;

public class EntrancePanel {
    private String id;

    public EntrancePanel(String id) {
        this.id = id;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        if(!ParkingLot.getInstance().canPark(vehicle.getType())) {
            return null;
        }

        ParkingSpot parkingSpot = ParkingLot.getInstance().getParkingSpot(vehicle.getType());
        if (parkingSpot == null) {
            return  null;
        }

        return buildTicket(vehicle, parkingSpot.getParkingSpotId());
    }


}
