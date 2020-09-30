package trspo.factoryproject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trspo.factoryproject.repo.OrderRepository;
import trspo.factoryproject.services.OrderService;
import trspo.factoryproject.services.impl.OrderServiceImpl;
import trspo.factoryproject.services.model.Order;
import trspo.factoryproject.services.model.dto.OrdersDTO;
import trspo.factoryproject.services.model.dto.createOrderDTO;

import java.util.List;

@RestController
@RequestMapping("my_order")
public class OrderController {
    private final OrderServiceImpl orderService;

    @Autowired
    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping("getAll")
    public List<Order> index() { return orderService.getOrders(); }

    @PostMapping("create")
    public ResponseEntity<Void> createOrder(@RequestBody createOrderDTO order){
        String type = order.getType();
        double amount = order.getAmount();
        int price = order.getPrice();
        String provider = order.getProvider();
        orderService.addOrder(type, amount, price, provider);
        return ResponseEntity.ok().build();
    }


}
