package trspo.factoryproject.services.impl;

import org.springframework.stereotype.Service;
import trspo.factoryproject.services.WeightService;
import trspo.factoryproject.services.model.Order;
import trspo.factoryproject.services.model.Vehicle;
import trspo.factoryproject.services.model.Weight;
import trspo.factoryproject.services.model.Worker;

import java.util.ArrayList;

@Service
public class WeightServiceImpl implements WeightService {
    final private ArrayList<Weight> weights = new ArrayList<>();

    public void addWeight(Worker loader, Worker worker){
        weights.add(new Weight(loader, worker));
    }

    public boolean deleteWeight(Weight weight){
        return weights.remove(weight);
    }

    public ArrayList<Weight> getWeights(){
        return weights;
    }

    public Weight getBy(int id) { return weights.get(id); }

    public void unpackWeight(Vehicle vehicle){
        vehicle.setStatusFree();
        vehicle.getWeight().setStatusReceived();
    }
}
