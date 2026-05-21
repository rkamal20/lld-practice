package problems.parkinglot;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class ParkingLot {
    private List<Floor> floors;
    private Map<String, Ticket> tickets;

    public ParkingLot(List<Floor> floors) {
        this.floors = floors;
        this.tickets = new HashMap<>();
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (Floor floor : this.floors) {
            Slot slot = floor.checkAvailableSlot(vehicle);
            if (slot != null) {
                slot.parkVehicle(vehicle);

                String ticketId = UUID.randomUUID().toString();
                LocalTime entryTime = LocalTime.now();
                Ticket ticket = new Ticket(ticketId, entryTime, vehicle, slot);
                tickets.put(ticketId, ticket);

                System.out.println("Vehicle parked. Ticket Id: " + ticketId);
                return ticket;
            }
        }
        System.out.println("No available slot!");
        return null;
    }

    public void exitVehicle(String ticketId) {
        Ticket ticket = tickets.get(ticketId);
        if (ticket == null) {
            System.out.println("Invalid ticket!");
            return;
        }
        LocalTime exitTime = LocalTime.now();
        long durationMillis = Duration.between(ticket.entryTime, exitTime).toMillis();

        PricingStrategy strategy = StrategyFactory.getStrategy(ticket.vehicle.type);
        double fare = strategy.calculateFare(durationMillis);

        ticket.slot.removeVehicle();
        tickets.remove(ticketId);

        System.out.println("Vehicle exited, Amount to pay: " + fare);
    }
}
