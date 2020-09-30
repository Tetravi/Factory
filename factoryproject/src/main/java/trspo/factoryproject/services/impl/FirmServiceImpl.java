package trspo.factoryproject.services.impl;

import org.springframework.stereotype.Service;
import trspo.factoryproject.services.FirmService;
import trspo.factoryproject.services.model.Order;
import trspo.factoryproject.services.model.Vehicle;
import trspo.factoryproject.services.model.Worker;

import java.util.ArrayList;

@Service
public class FirmServiceImpl implements FirmService {
    final private ArrayList<Worker> workers = new ArrayList<>();

    public void addWorker(String name, String job, int salary){
        workers.add(new Worker(name, job, salary));
        int index = workers.size();
        System.out.println("Рабочий " +  workers.get(index - 1).toString() + " добавлен");
    }

    public ArrayList<Worker> getWorkers() { return workers; }

    public Worker getBy(int id) { return workers.get(id); }

    public boolean deleteWorker(Worker worker){
        return workers.remove(worker);
    }


    public void cashOperations(Vehicle vehicle){
        vehicle.getWeight().getLoader().giveSalary(vehicle.getOrder().getPrice() * 0.1);
        vehicle.getWeight().getWorker().giveSalary(vehicle.getOrder().getPrice() * 0.1);
        vehicle.getDriver().giveSalary(vehicle.getOrder().getPrice() * 0.1);
    }
}
