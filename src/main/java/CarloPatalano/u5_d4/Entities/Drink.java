package CarloPatalano.u5_d4.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private int calories;
    private String capacity;


    public Drink(String name, double price, int calories, String capacity) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return name;
    }
}
