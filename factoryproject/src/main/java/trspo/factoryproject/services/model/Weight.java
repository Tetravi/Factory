package trspo.factoryproject.services.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "weight")
public class Weight {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "worker_id")
    private Worker loader;
    @OneToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;
    private Status status;

    public Weight(Worker loader, Worker worker) {
        this.loader = loader;
        this.worker = worker;
        this.status = Status.DELIVERING;
    }

    public Weight() {

    }

    public Status getStatus(){
        return status;
    }

    public Worker getLoader() { return loader; }

    public Worker getWorker() { return worker; }

    public void setStatusReceived(){
        this.status = Status.RECEIVED;
    }

    @Override
    public String toString(){
        return "Грузчик " + loader + "принимает заказ для " + worker;
    }
}
