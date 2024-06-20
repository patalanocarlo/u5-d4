package CarloPatalano.u5_d4.Service;

import CarloPatalano.u5_d4.Entities.Pizza;
import CarloPatalano.u5_d4.JPARepositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza savePizza(Pizza pizza){
        return pizzaRepository.save(pizza);
    }
    public void deletePizza(Long id) {
        pizzaRepository.deleteById(id);
    }
}
