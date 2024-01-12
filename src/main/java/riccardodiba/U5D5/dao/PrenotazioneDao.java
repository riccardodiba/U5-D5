package riccardodiba.U5D5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riccardodiba.U5D5.entites.Prenotazione;
import riccardodiba.U5D5.entites.Utente;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface PrenotazioneDao extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
}