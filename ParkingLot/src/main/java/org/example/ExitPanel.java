package org.example;


import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@Setter
public class ExitPanel {
    private String id;

    public ExitPanel(String id) {
        this.id = id;
    }

    public ParkingTicket scanAndVacate(ParkingTicket parkingTicket) {
        ParkingSpot parkingSpot = ParkingLot.getInstance().vacateParkingSpot(parkingTicket.getAllocatedSpotId());

        parkingTicket.setCharges(calculateCost(parkingTicket, parkingSpot.getType()));
        return parkingTicket;
    }

    public double calculateCost(ParkingTicket parkingTicket, ParkingSpotType parkingSpotType) {
        Duration duration = Duration.between(parkingTicket.getIssuedAt(), LocalDateTime.now());
        long hours = duration.toHours();

        if(hours == 0) {
            hours =1;
        }

        return hours * 1.5;
    }
}
