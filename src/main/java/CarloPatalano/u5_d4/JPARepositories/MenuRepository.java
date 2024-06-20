package CarloPatalano.u5_d4.JPARepositories;

import CarloPatalano.u5_d4.Entities.Drink;
import CarloPatalano.u5_d4.Entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
