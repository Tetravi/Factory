package trspo.factoryproject.services.impl;

import org.springframework.stereotype.Service;
import trspo.factoryproject.services.OrderService;
import trspo.factoryproject.services.model.Order;

import java.util.ArrayList;

@Service
public class OrderServiceImpl implements OrderService {
    final private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(String type, double amount, int price,
                         String provider){
        orders.add(new Order(type, amount, price, provider));
        System.out.println("Новый заказ добавлен");
        System.out.println(orders.toString());
    }

    public ArrayList<Order> getOrders(){
        return orders;
    }


    public Order getBy(int id) { return orders.get(id); }

    public boolean deleteOrder(Order order){
        return orders.remove(order);
    }
}
