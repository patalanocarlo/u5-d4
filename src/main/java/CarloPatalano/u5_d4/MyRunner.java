package CarloPatalano.u5_d4;

import CarloPatalano.u5_d4.Entities.*;
import CarloPatalano.u5_d4.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private ToppingsService toppingsService;

    @Autowired
    private DrinkService drinkService;

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private OrdineService orderService;

    @Autowired
    private TavoloService tavoloService;
    @Value("${costo.coperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) throws Exception {

        List<Toppings> toppings = Arrays.asList(
                new Toppings("Mozzarella", 50, 1.0),
                new Toppings("Pomodoro", 20, 1.0)
        );
        List<Toppings> toppings2 = Arrays.asList(
                new Toppings("Patatine", 250, 1.0),
                new Toppings("Wrustel", 120, 2.0)
        );
        toppings2.forEach(toppingsService::saveTopping);
        toppings.forEach(toppingsService::saveTopping);
        List<Drink> drinks = Arrays.asList(
                new Drink("Coca Cola", 2.99, 120, "0.33CL"),
                new Drink("Fanta", 1.99, 110, "0.33CL"),
                new Drink("Pepsi Cola", 2.99, 90, "0.33CL")
        );
        drinks.forEach(drinkService::saveDrink);
        List<Pizza> pizzas = Arrays.asList(
                new Pizza("Margherita", 6.99, 1000, toppings),
                new Pizza("Wrustel e patatine",7.99,1500,toppings2)
        );
        pizzas.forEach(pizzaService::savePizza);
        Menu menu = new Menu(toppings,pizzas,drinks);
        menuService.saveMenu(menu);
        System.out.println("Menu: " + menu);

        Tavolo tavolo = new Tavolo(1, 4);
        tavoloService.savetavolo(tavolo);

        Ordine ordine = new Ordine( pizzas, drinks, costoCoperto);
        orderService.saveOrdine(ordine);
        double totalOrderPrice = orderService.getCalculate(ordine);
        System.out.println("Total Order Price: " + totalOrderPrice);
    }
}
