package problems.parkinglot;

import java.time.LocalTime;

public class Ticket {
    String id;
    LocalTime entryTime;
    Vehicle vehicle;
    Slot slot;

    public Ticket(String id, LocalTime entryTime, Vehicle vehicle, Slot slot) {
        this.id = id;
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.slot = slot;
    }
}
