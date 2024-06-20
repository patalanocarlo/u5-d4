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
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numero;
    private int numeroCopertiMax;
    private String stato;

    public Tavolo(int numero, int numeroCopertiMax) {
        this.numero = numero;
        this.numeroCopertiMax = numeroCopertiMax;
        this.stato = "Occupato";
    }
}
