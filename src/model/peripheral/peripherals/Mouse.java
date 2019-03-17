package model.peripheral.peripherals;

import model.peripheral.Peripheral;
import model.peripheral.interfaces.BallMouse;
import model.peripheral.interfaces.OpticalMouse;
import model.peripheral.interfaces.WiredPeripheral;
import model.peripheral.interfaces.WirelessPeripheral;

public class Mouse extends Peripheral implements
        BallMouse,
        OpticalMouse,
        WiredPeripheral,
        WirelessPeripheral {
    private boolean hasScrollWheel;
    private String ballMaterial;
    private String wirelessType;


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

    @Override
    public void setBallMaterial(String material) {
        this.ballMaterial = material;
    }

    @Override
    public void setDPI(int dpi) {

    }

    @Override
    public void setCableLength(int length) {

    }

    @Override
    public void setWirelessInterfaceType(String wirelessType) {
        this.wirelessType = wirelessType;
    }
}
