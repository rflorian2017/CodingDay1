package model.peripheral;

import model.peripheral.peripherals.Mouse;

public class Peripheral {
    private String connectionToComputer;
    private String brand;

    public Peripheral(String connectionToComputer, String brand) {
        this.connectionToComputer = connectionToComputer;
        this.brand = brand;
    }

    public String getConnectionToComputer() {
        return connectionToComputer;
    }

    public void setConnectionToComputer(String connectionToComputer) {
        this.connectionToComputer = connectionToComputer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String displayDetails() {
        String toReturn = "I am peripheral ";

        return toReturn;
    }

}
