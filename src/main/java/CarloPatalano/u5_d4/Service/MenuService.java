package CarloPatalano.u5_d4.Service;

import CarloPatalano.u5_d4.Entities.Menu;
import CarloPatalano.u5_d4.JPARepositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }
}
