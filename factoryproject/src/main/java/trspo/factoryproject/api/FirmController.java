package trspo.factoryproject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trspo.factoryproject.services.FirmService;
import trspo.factoryproject.services.impl.FirmServiceImpl;
import trspo.factoryproject.services.model.Vehicle;
import trspo.factoryproject.services.model.Worker;
import trspo.factoryproject.services.model.dto.createWorkerDTO;

import java.util.List;

@RestController
@RequestMapping("firm")
public class FirmController {
    private final FirmServiceImpl firmService;

    @Autowired
    public FirmController(FirmServiceImpl firmService) {
        this.firmService = firmService;
    }

    @GetMapping("getAll")
    public List<Worker> index() { return firmService.getWorkers(); }

    @PostMapping("create")
    public ResponseEntity<Void> createWorker(@RequestBody createWorkerDTO worker){
        String name = worker.getName();
        String job = worker.getJob();
        int salary = worker.getSalary();
        firmService.addWorker(name, job, salary);
        return ResponseEntity.ok().build();
    }

    @PostMapping("giveCash")
    public ResponseEntity<Void> giveCash(@RequestBody Vehicle vehicle) {
        firmService.cashOperations(vehicle);
        return ResponseEntity.ok().build();
    }
}
