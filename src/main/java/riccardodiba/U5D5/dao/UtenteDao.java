package riccardodiba.U5D5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riccardodiba.U5D5.entites.Utente;
@Repository
public interface UtenteDao extends JpaRepository<Utente, String> {

}