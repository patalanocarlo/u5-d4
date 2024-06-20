package CarloPatalano.u5_d4.Service;


import CarloPatalano.u5_d4.Entities.Tavolo;

import CarloPatalano.u5_d4.JPARepositories.TavoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TavoloService {

@Autowired
private TavoloRepository tavoloRepository;

    public Tavolo savetavolo(Tavolo tavolo) {
        return tavoloRepository.save(tavolo);
    }

    public void deleteOTavolo(Long id) {
       tavoloRepository.deleteById(id);
    }
}
