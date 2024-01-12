package riccardodiba.U5D5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riccardodiba.U5D5.entites.Edificio;
@Repository
public interface EdificioDao extends JpaRepository<Edificio, Long> {

}