package CarloPatalano.u5_d4.JPARepositories;

import CarloPatalano.u5_d4.Entities.Drink;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
}
