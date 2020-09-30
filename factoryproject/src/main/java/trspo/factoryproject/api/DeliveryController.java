package trspo.factoryproject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import trspo.factoryproject.services.impl.DeliveryServiceImpl;
import trspo.factoryproject.services.model.Order;
import trspo.factoryproject.services.model.Vehicle;

import java.util.List;

public class DeliveryController {
    private final DeliveryServiceImpl deliveryService;

    @Autowired
    public
    DeliveryController(DeliveryServiceImpl deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("getAll")
    public List<Vehicle> index() { return deliveryService.getVehicles(); }

    @PostMapping("giveCash")
    public ResponseEntity<Void> giveCash(@RequestBody Order order) {
        deliveryService.setVehicle(order);
        return ResponseEntity.ok().build();
    }
}
