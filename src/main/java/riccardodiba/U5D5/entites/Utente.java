package riccardodiba.U5D5.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "utenti")
@NoArgsConstructor
@ToString
public class Utente {

    @Id
    @GeneratedValue
    private long id;

    private String nome;

    private String nomeCompleto;

    private String email;

    public Utente(long id, String nome, String nomeCompleto, String email) {
        this.nome = nome;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }
}
