package riccardodiba.U5D5.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "edifici")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Edificio {

    @Id
    @GeneratedValue

    private long id;

    private String nomeEdificio;

    private String indirizzo;

    private String citta;


    public Edificio(String nomeEdificio, String indirizzo, String citta) {
        this.nomeEdificio= nomeEdificio;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

}