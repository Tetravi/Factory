package trspo.factoryproject.services;

import trspo.factoryproject.services.model.Vehicle;
import trspo.factoryproject.services.model.Weight;
import trspo.factoryproject.services.model.Worker;

import java.util.ArrayList;

public interface WeightService {
    void addWeight(Worker loader, Worker worker);

    boolean deleteWeight(Weight weight);

    ArrayList<Weight> getWeights();

    public void unpackWeight(Vehicle vehicle);
}
