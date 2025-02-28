package org.example;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
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
        parkingSpot.assignVehicle(vehicle);
        if (parkingSpot == null) {
            return  null;
        }

        return buildTicket(vehicle.getLicenseNumber(), parkingSpot.getId());
    }

    public ParkingTicket buildTicket(String vehicleLicenseNumber, String parkingSpotId) {
        ParkingTicket parkingTicket = new ParkingTicket();
        parkingTicket.setIssuedAt(LocalDateTime.now());
        parkingTicket.setAllocatedSpotId(parkingSpotId);
        parkingTicket.setLicensePlateNumber(vehicleLicenseNumber);
        parkingTicket.setTicketNumber(UUID.randomUUID().toString());
        parkingTicket.setStatus(TicketStatus.ACTIVE);
        return parkingTicket;
    }


}
