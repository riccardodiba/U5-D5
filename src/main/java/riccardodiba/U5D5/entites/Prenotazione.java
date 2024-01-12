package riccardodiba.U5D5.entites;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    @ManyToOne
    @JoinColumn(name = "utente_nome")
    private Utente utente;

    private LocalDate dataPrenotazione;
}