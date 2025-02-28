package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

@Getter
@Setter
public class ParkingFloor {
    private String parkingFloorId;

    private Map<ParkingSpotType, Deque<ParkingSpot>> parkingSpots = new HashMap<>();
    private Map<String, ParkingSpot> usedParkingSpots = new HashMap<>();

    public ParkingFloor(String id) {
        this.parkingFloorId = id;
        parkingSpots.put(ParkingSpotType.CAR, new ArrayDeque<>());
        parkingSpots.put(ParkingSpotType.MOTORBIKE, new ArrayDeque<>());
        parkingSpots.put(ParkingSpotType.LARGE, new ArrayDeque<>());
    }

    public boolean isFull() {
        for(Deque<ParkingSpot> spots : parkingSpots.values()) {
            if(!spots.isEmpty()) {
                return false;
            }
        }
        return true;
    }


    public static ParkingSpotType getSpotTypeForVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return ParkingSpotType.CAR;
            case MOTORBIKE:
                return ParkingSpotType.MOTORBIKE;
            default:
                return ParkingSpotType.LARGE;
        }
    }

    public boolean canPark(VehicleType vehicleType) {
        return  canPark(getSpotTypeForVehicle(vehicleType));
    }
    public boolean canPark(ParkingSpotType parkingSpotType) {
        return !parkingSpots.get(parkingSpotType).isEmpty();
    }

    public ParkingSpot getParkingSpot(VehicleType vehicleType) {

        if(!canPark(vehicleType)) {
            return null;
        }

        ParkingSpotType parkingSpotType = getSpotTypeForVehicle(vehicleType);
        ParkingSpot parkingSpot = parkingSpots.get(parkingSpotType).poll();

        usedParkingSpots.put(parkingSpot.getId(), parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot vacateSpot(String parkingSpotId) {
        ParkingSpot parkingSpot = usedParkingSpots.remove(parkingSpotId);

        if(parkingSpot != null) {
            parkingSpot.freeSpot();
            parkingSpots.get(parkingSpot.getType()).addFirst(parkingSpot);
            return parkingSpot;
        }
        return null;
    }


}
