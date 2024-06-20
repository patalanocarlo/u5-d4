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

public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double price;
    private int calories;
    @ManyToMany
    private List<Toppings> toppings;

    public Pizza(String name, double price, int calories, List<Toppings> toppings) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppings = toppings;
    }
    public double getTotalPrice() {
        return price + toppings.stream().mapToDouble(Toppings::getPrice).sum();
    }
    @Override
    public String toString() {
        return name + " (" + toppings + ")";
    }
}
