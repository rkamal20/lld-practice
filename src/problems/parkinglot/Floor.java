package src.problems.parkinglot;

import java.util.*;

public class Floor {
    private int number;
    private List<Slot> slots;

    public Floor(int number, List<Slot> slots) {
        this.number = number;
        this.slots = slots;
    }

    public Slot checkAvailableSlot(Vehicle vehicle) {
        for (Slot slot : slots) {
            if (slot.canFit(vehicle))
                return slot;
        }
        return null;
    }
}
