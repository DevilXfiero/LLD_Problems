package org.example;

public class ParkingLotApplication {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = ParkingLot.getInstance();

        String address = "Optum P1 parking, Pheonix Towers, Hyderabad";
        parkingLot.setAddress(address);


        EntrancePanel entrancePanel = new EntrancePanel("1");
        ExitPanel exitPanel = new ExitPanel("1");

        parkingLot.addParkingFloor(new ParkingFloor("1"));
        parkingLot.addParkingFloor(new ParkingFloor("2"));

        parkingLot.addEntrancePanel(entrancePanel);
        parkingLot.addExitPanel(exitPanel);

        String floorId = parkingLot.getParkingFloors().get(0).getParkingFloorId();

        ParkingSpot carSpot = new CarParkingSpot("c1");
        ParkingSpot motorbikeSpot = new MotorBikeParkingSpot("b1");

        parkingLot.addParkingSpot(floorId, carSpot);
        parkingLot.addParkingSpot(floorId, motorbikeSpot);

//        System.out.println(ParkingLot.getInstance().canPark(VehicleType.CAR));
//        System.out.println(ParkingLot.getInstance().canPark(VehicleType.MOTORBIKE));
//        System.out.println(ParkingLot.getInstance().canPark(VehicleType.ELECTRIC));

        Vehicle car = new Car("UP00718920");
        ParkingTicket parkingTicket = entrancePanel.getParkingTicket(car);
        System.out.println(parkingTicket.getAllocatedSpotId());

        parkingTicket = exitPanel.scanAndVacate(parkingTicket);
        System.out.println(parkingTicket.getCharges());



    }
}
