package trspo.factoryproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trspo.factoryproject.services.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
