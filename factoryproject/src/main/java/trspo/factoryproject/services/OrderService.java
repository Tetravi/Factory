package trspo.factoryproject.services;

import trspo.factoryproject.services.model.Order;

import java.util.ArrayList;

public interface OrderService {
    void addOrder(String type, double amount, int price,
                         String provider);

    ArrayList<Order> getOrders();

    boolean deleteOrder(Order order);
}
