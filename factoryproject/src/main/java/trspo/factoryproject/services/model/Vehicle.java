package trspo.factoryproject.services.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "driver_id")
    final private Worker driver;
    final private String number;
    final private double maxWeight;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @OneToOne
    @JoinColumn(name = "weight_id")
    private Weight weight;
    private Status status;

    public Vehicle(Worker driver, String number, double maxWeight) {
        this.driver = driver;
        this.number = number;
        this.maxWeight = maxWeight;
        this.status = Status.FREE;
    }

    public Vehicle() {
        driver = null;
        number = null;
        maxWeight = 0;
    }

    public void setStatusBusy() { this.status = Status.BUSY; }

    public void setStatusFree(){
        this.status = Status.FREE;
    }

    public void setOrder(Order order ){
        this.order = order;
    }

    public void setWeight(Weight weight ){
        this.weight = weight;
    }

    public Order getOrder(){
        return order;
    }

    public Weight getWeight(){
        return weight;
    }

    public Worker getDriver() { return driver; }

    public Status getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return "Номер транспорта: " + number + '\''
                + "Максимальная грузоподъемность: " + maxWeight + '\''
                + "Водитель: " + driver;
    }
}
