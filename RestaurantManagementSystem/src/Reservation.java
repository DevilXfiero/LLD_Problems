import enums.ReservationStatus;

import java.time.LocalDateTime;

public class Reservation {

    private LocalDateTime timeOfReservation;
    private int peopleCount;
    private ReservationStatus status;
    private String notes;
    private LocalDateTime checkinTime;

    public Reservation(LocalDateTime timeOfReservation, int peopleCount, ReservationStatus status, String notes, LocalDateTime checkinTime, Customer customer, Table[] tables) {
        this.timeOfReservation = timeOfReservation;
        this.peopleCount = peopleCount;
        this.status = status;
        this.notes = notes;
        this.checkinTime = checkinTime;
        this.customer = customer;
        this.tables = tables;
    }

    private Customer customer;

    private Table[] tables;

}
