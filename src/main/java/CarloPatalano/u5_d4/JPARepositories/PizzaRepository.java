package CarloPatalano.u5_d4.JPARepositories;

import CarloPatalano.u5_d4.Entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
