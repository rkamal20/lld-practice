package problems.parkinglot;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(); // design parking lot

        List<Slot> slots1 = Arrays.asList(new Slot(1, VehicleType.CAR), new Slot(2, VehicleType.BIKE));
        List<Slot> slots2 = Arrays.asList(new Slot(3, VehicleType.BIKE), new Slot(4, VehicleType.CAR));

        List<Floor> floors = Arrays.asList(new Floor(2, slots1), new Floor(10, slots2));

        Vehicle v1 = new Vehicle("UP12", VehicleType.CAR);
        Vehicle v2 = new Vehicle("UP13", VehicleType.BIKE);
        Vehicle v3 = new Vehicle("UP14", VehicleType.TRUCK);

        ParkingLot p = new ParkingLot(floors);

        Ticket ticket1 = p.parkVehicle(v1);
        Ticket ticket2 = p.parkVehicle(v2);
        Ticket ticket3 = p.parkVehicle(v3);

        sleep(100);

        p.exitVehicle(ticket1 != null ? ticket1.id : null);
        p.exitVehicle(ticket2 != null ? ticket2.id : null);
        p.exitVehicle(ticket3 != null ? ticket3.id : null);

        System.out.println();
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
