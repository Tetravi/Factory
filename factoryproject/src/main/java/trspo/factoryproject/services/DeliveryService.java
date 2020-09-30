package trspo.factoryproject.services;

import trspo.factoryproject.services.model.Order;
import trspo.factoryproject.services.model.Vehicle;
import trspo.factoryproject.services.model.Worker;

import java.util.ArrayList;

public interface DeliveryService {
    void addVehicle(Worker driver, String number,
                           double maxWeight);

    boolean deleteVehicle(Vehicle vehicle);

    ArrayList<Vehicle> getVehicles();

    void setVehicle(Order order);
}
