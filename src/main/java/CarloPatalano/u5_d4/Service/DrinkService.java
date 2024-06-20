package CarloPatalano.u5_d4.Service;

import CarloPatalano.u5_d4.Entities.Drink;
import CarloPatalano.u5_d4.JPARepositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {
    @Autowired
    private DrinkRepository drinkRepository;
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    public void deleteDrink(Long id) {
        drinkRepository.deleteById(id);
    }
}
