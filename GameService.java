package fsb.gs.service;

import org.springframework.stereotype.Repository;

import fsb.gs.model.Game;

@Repository
public interface GameService {

	public void createGame(Game game);
	
	public Game updateGame(Game game);
	
	public Game readGame(String gameName);

	public void deleteGame(String gameName);
	
}
