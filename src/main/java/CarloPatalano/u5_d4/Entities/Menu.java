package CarloPatalano.u5_d4.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "menu_id")
    private List<Toppings> toppings;

    @OneToMany
    @JoinColumn(name = "menu_id")
    private List<Pizza> pizzas;

    @OneToMany
    @JoinColumn(name = "menu_id")
    private List<Drink> drinks;

    @Column(name = "toppings_names")
    private String toppingsNames;

    @Column(name = "pizza_names")
    private String pizzaNames;

    @Column(name = "drink_names")
    private String drinkNames;


    public Menu(List<Toppings> toppings, List<Pizza> pizzas, List<Drink> drinks) {
        this.toppings = toppings;
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.toppingsNames = generateToppingsNames();
        this.pizzaNames = generatePizzaNames();
        this.drinkNames = generateDrinkNames();

    }

    private String generateToppingsNames() {
        StringBuilder sb = new StringBuilder();
        toppings.forEach(t -> sb.append(t.getName()).append(", "));
        return sb.toString();
    }

    private String generatePizzaNames() {
        StringBuilder sb = new StringBuilder();
        pizzas.forEach(p -> sb.append(p.getName()).append(", "));

        return sb.toString();
    }

    private String generateDrinkNames() {
        StringBuilder sb = new StringBuilder();
        drinks.forEach(d -> sb.append(d.getName()).append(", "));
        return sb.toString();
    }


    @Override
    public String toString() {
        return "Menu{" +
                "toppingsNames='" + toppingsNames + '\'' +
                ", pizzaNames='" + pizzaNames + '\'' +
                ", drinkNames='" + drinkNames + '\'' +
                '}';
    }
}
