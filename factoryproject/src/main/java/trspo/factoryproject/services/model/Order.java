package trspo.factoryproject.services.model;


import java.util.Calendar;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "my_order")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    final private String type;
    final private double amount;
    final private int price;
    final private String provider;
    final private Calendar date;
    final private Status status;

    public Order(){
        super();
        type = null;
        amount = 0;
        price = 0;
        provider = null;
        date = null;
        status = null;
    }

    public Order(String type, double amount, int price, String provider) {
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.provider = provider;
        this.date = Calendar.getInstance();
        this.status = Status.ORDERED;
    }

    public Status getStatus(){
        return status;
    }

    public int getPrice() { return price; }

    @Override
    public String toString(){
        return "{Заказ материалов типа " + type + " в количестве " + amount
                + " Поставщик: " + provider
                + " Дата заказа: " + date.getTime() + " Цена: " + price + "}";
    }
}
