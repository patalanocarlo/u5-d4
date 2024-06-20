package CarloPatalano.u5_d4.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter

@NoArgsConstructor
public class Toppings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double price;
    private int calories;

    public Toppings(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
    @Override
    public String toString() {
        return name;
    }
}
