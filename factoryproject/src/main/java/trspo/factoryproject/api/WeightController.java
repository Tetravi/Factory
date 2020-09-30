package trspo.factoryproject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import trspo.factoryproject.services.WeightService;
import trspo.factoryproject.services.impl.WeightServiceImpl;
import trspo.factoryproject.services.model.Vehicle;
import trspo.factoryproject.services.model.Weight;

import java.util.List;

public class WeightController {
    private final WeightServiceImpl weightService;

    @Autowired
    public
    WeightController(WeightServiceImpl weightService) {
        this.weightService = weightService;
    }

    @GetMapping("getAll")
    public List<Weight> index() { return weightService.getWeights(); }

    @PostMapping("unpack")
    public ResponseEntity<Void> unpack(@RequestBody Vehicle vehicle) {
        weightService.unpackWeight(vehicle);
        return ResponseEntity.ok().build();
    }
}
