package riccardodiba.U5D5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riccardodiba.U5D5.entites.Postazione;
import riccardodiba.U5D5.entites.TipoPostazione;

import java.util.List;
@Repository
public interface PostazioneDao extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
}