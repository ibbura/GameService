package fsb.gs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fsb.gs.model.Game;

@Repository
public interface GameServiceRepository extends JpaRepository<Game, String> {

}
