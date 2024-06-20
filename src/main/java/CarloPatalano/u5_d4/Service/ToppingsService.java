package CarloPatalano.u5_d4.Service;

import CarloPatalano.u5_d4.Entities.Toppings;
import CarloPatalano.u5_d4.JPARepositories.ToppingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingsService {
    @Autowired
    private ToppingsRepository toppingsRepository;

    public Toppings saveTopping(Toppings toppings){
       return toppingsRepository.save(toppings);
    }
    public void deleteToppings(Long id) {
        toppingsRepository.deleteById(id);
    }
}
