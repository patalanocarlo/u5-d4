package CarloPatalano.u5_d4.Service;

import CarloPatalano.u5_d4.Entities.Ordine;
import CarloPatalano.u5_d4.JPARepositories.OrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdineService {

@Autowired
private OrdineRepository ordineRepository;

    public Ordine saveOrdine(Ordine ordine) {
        return ordineRepository.save(ordine);
    }

    public void deleteOrdine(Long id) {
        ordineRepository.deleteById(id);
    }
    public double getCalculate(Ordine ordine) {
        return ordine.getTotalPrice();
    }
}
