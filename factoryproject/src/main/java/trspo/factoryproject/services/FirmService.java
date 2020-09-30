package trspo.factoryproject.services;

import trspo.factoryproject.services.model.Order;
import trspo.factoryproject.services.model.Vehicle;
import trspo.factoryproject.services.model.Worker;

import java.util.ArrayList;

public interface FirmService {

    void addWorker(String name, String job, int salary);

    ArrayList<Worker> getWorkers();

    boolean deleteWorker(Worker worker);

    void cashOperations(Vehicle vehicle);
}
;