package trspo.factoryproject.services.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "worker")
public class Worker {
    @Id
    @GeneratedValue
    private Long id;
    final private String name;
    final private String job;
    private int salary;

    public Worker() {
        super();
        name = null;
        job = null;
    }

    public Worker(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public void giveSalary(double _salary){
        salary += _salary;
    }

    public int getSalary() { return salary; }

    public String getName() { return name; }

    @Override
    public String toString(){
        return job +"  " + name;
    }
}
