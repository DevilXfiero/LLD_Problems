package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ParkingLot {
    private String parkingLotId;
    private String address;
    private static  ParkingLot parkingLotInstance = null;

    List<ParkingFloor> parkingFloors;
    List<EntrancePanel> entrancePanels;
    List<ExitPanel> exitPanels;

    public static ParkingLot getInstance() {
        if(parkingLotInstance == null ) {
            parkingLotInstance = new ParkingLot();
        }
        return parkingLotInstance;
    }

    private ParkingLot() {
        this.parkingLotId = UUID.randomUUID().toString();
        parkingFloors = new ArrayList<>();
        entrancePanels = new ArrayList<>();
        exitPanels = new ArrayList<>();
    }

    public canPark()
}
