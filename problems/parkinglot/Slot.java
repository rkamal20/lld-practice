package problems.parkinglot;

public class Slot {
    private int id;
    private VehicleType type;
    private boolean isOccupied;
    private Vehicle vehicle;

    public Slot(int id, VehicleType type) {
        this.id = id;
        this.type = type;
    }

    public boolean canFit(Vehicle vehicle) {
        return !this.isOccupied && this.type == vehicle.type;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.isOccupied = true;
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.isOccupied = false;
        this.vehicle = null;
    }
}
