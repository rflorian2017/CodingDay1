package model.peripheral.peripherals.mice;

import model.peripheral.peripherals.Mouse;

public class WiredMouse extends Mouse {
    public WiredMouse(String connectionToComputer, String brand) {
        super(connectionToComputer, brand);
    }

    public WiredMouse(String connectionToComputer, String brand, boolean hasScrollWheel) {
        super(connectionToComputer, brand, hasScrollWheel);
    }
}
