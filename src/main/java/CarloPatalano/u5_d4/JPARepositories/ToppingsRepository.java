package CarloPatalano.u5_d4.JPARepositories;


import CarloPatalano.u5_d4.Entities.Toppings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingsRepository extends JpaRepository<Toppings, Long> {
}
