package model.peripheral.peripherals;

import model.peripheral.Peripheral;

public class Mouse extends Peripheral {
    private boolean hasScrollWheel;

    public Mouse(String connectionToComputer, String brand) {
        super(connectionToComputer, brand);
        this.hasScrollWheel = false;
    }

    public Mouse(String connectionToComputer, String brand, boolean hasScrollWheel) {
        super(connectionToComputer, brand);
        this.hasScrollWheel = hasScrollWheel;
    }

    public boolean isHasScrollWheel() {
        return hasScrollWheel;
    }

    public void setHasScrollWheel(boolean hasScrollWheel) {
        this.hasScrollWheel = hasScrollWheel;
    }

    @Override
    public String displayDetails() {
        String textToReturn = super.displayDetails();

            textToReturn += "of type mouse with " +
                    this.getConnectionToComputer() +
                    " connection made by " +
                    this.getBrand() + " and I have a wheel?"
                    + this.isHasScrollWheel();

        return textToReturn;
    }
}
