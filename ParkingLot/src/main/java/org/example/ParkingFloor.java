package org.example;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ParkingFloor {
    private String parkingFloorId;

    private Map<ParkingSpotType, Deque<ParkingSpot>> parkingSpots = new HashMap<>();
    private Map<String, ParkingSpot> usedParkingSpots = new HashMap<>();

    public ParkingFloor(String id) {
        this.parkingFloorId = id;
        parkingSpots.put(ParkingSpotType.HANDICAPPED, new Deque<ParkingSpot>());


    }
}
