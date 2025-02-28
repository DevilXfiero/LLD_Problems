package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Getter
@Setter
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

    public void addParkingFloor(ParkingFloor parkingFloor) {
        Optional<ParkingFloor> parkingFloorOptional = parkingFloors.stream()
                .filter(pf -> pf.getParkingFloorId().equalsIgnoreCase(parkingFloor.getParkingFloorId()))
                .findFirst();
        if(parkingFloorOptional.isPresent()) {
            return;
        }

        parkingFloors.add(parkingFloor);
    }

    public void addParkingSpot(String parkingFloorId, ParkingSpot parkingSpot) throws Exception {
        Optional<ParkingFloor> floor = parkingFloors.stream().filter(pf -> pf.getParkingFloorId().equalsIgnoreCase(parkingFloorId)).findFirst();

        if(!floor.isPresent()) {
            throw new Exception("Invalid Floor");
        }

        Optional<ParkingSpot> spot = floor.get().getParkingSpots().get(parkingSpot.getType())
                .stream()
                .filter(ps -> ps.getId().equalsIgnoreCase(parkingSpot.getId()))
                .findFirst();

        if(spot.isPresent()) {
            return;
        }

        floor.get().getParkingSpots().get(parkingSpot.getType()).addLast(parkingSpot);
    }

    public void addEntrancePanel(EntrancePanel entrancePanel) {
        Optional<EntrancePanel> panel =
                ParkingLot.getInstance().getEntrancePanels().stream()
                        .filter(eP -> eP.getId().equalsIgnoreCase(entrancePanel.getId())).findFirst();
        if (panel.isPresent())
            return;
        ParkingLot.getInstance().getEntrancePanels().add(entrancePanel);
    }

    public void addExitPanel(ExitPanel exitPanel) {
        Optional<ExitPanel> panel =
                ParkingLot.getInstance().getExitPanels().stream()
                        .filter(eP -> eP.getId().equalsIgnoreCase(exitPanel.getId())).findFirst();
        if (panel.isPresent())
            return;
        ParkingLot.getInstance().getExitPanels().add(exitPanel);
    }

    public boolean isFull() {
        for(ParkingFloor parkingFloor: parkingFloors) {
            if(!parkingFloor.isFull()) {
                return false;
            }
        }
        return true;
    }

    public boolean canPark(VehicleType vehicleType) {
        for(ParkingFloor parkingFloor : parkingFloors) {
            if(parkingFloor.canPark(ParkingFloor.getSpotTypeForVehicle(vehicleType)))
                return true;
        }
        return false;
    }

    public ParkingSpot getParkingSpot(VehicleType vehicleType) {
        for(ParkingFloor parkingFloor: parkingFloors) {
            ParkingSpot parkingSpot = parkingFloor.getParkingSpot(vehicleType);
            if(parkingSpot != null) {
                return parkingSpot;
            }
        }
        return null;
    }

    public ParkingSpot vacateParkingSpot(String parkingSpotId) {
        for(ParkingFloor parkingFloor : parkingFloors) {
            ParkingSpot parkingSpot = parkingFloor.vacateSpot(parkingSpotId);
            if(parkingSpot != null) {
                return parkingSpot;
            }
        }
        return null;
    }


}
