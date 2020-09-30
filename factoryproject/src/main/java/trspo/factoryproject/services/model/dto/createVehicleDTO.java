package trspo.factoryproject.services.model.dto;

import trspo.factoryproject.services.model.Worker;

public class createVehicleDTO {
    private Worker driver;
    private String number;
    private double maxWeight;

    public Worker getDriver() {
        return driver;
    }

    public void setDriver(Worker driver) {
        this.driver = driver;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}

