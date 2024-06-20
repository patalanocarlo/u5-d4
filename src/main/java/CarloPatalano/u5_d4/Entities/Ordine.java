package CarloPatalano.u5_d4.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "ordine_id")
    private List<Toppings> toppings;

    @OneToMany
    @JoinColumn(name = "ordine_id")
    private List<Pizza> pizzas;

    @OneToMany
    @JoinColumn(name = "ordine_id")
    private List<Drink> drinks;



    @Column(name = "pizza_names")
    private String pizzaNames;

    @Column(name = "drink_names")
    private String drinkNames;

    @Column(name = "total_price")
    private double totalPrice;


    @Column(name = "costo_coperto")
    private double costoCoperto;

    public Ordine( List<Pizza> pizzas, List<Drink> drinks, double costoCoperto) {

        this.pizzas = pizzas;
        this.drinks = drinks;

        this.pizzaNames = generatePizzaNames();
        this.drinkNames = generateDrinkNames();
        this.totalPrice = calculateTotalPrice();
        this.costoCoperto = costoCoperto;
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

    private double calculateTotalPrice() {
        double total = 0.0;

        for (Pizza p : pizzas) {
            total += p.getPrice();
        }
        for (Drink d : drinks) {
            total += d.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Ordine{" +

                ", pizzaNames='" + pizzaNames + '\'' +
                ", drinkNames='" + drinkNames + '\'' +
                ", totalPrice=" + totalPrice +
                ", costoCoperto=" + costoCoperto +
                '}';
    }
}
