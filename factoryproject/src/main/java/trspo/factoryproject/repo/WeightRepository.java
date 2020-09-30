package trspo.factoryproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trspo.factoryproject.services.model.Weight;

@Repository
public interface WeightRepository extends JpaRepository<Weight, Long> {
}
