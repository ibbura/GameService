package fsb.gs.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import fsb.gs.model.Game;
import fsb.gs.repository.GameServiceRepository;

@Service
public class GameServiceImpl implements GameService {

	GameServiceRepository repository;
	
	public GameServiceImpl() {

	}

	@Override
	public void createGame(Game game) {
		repository.save(game);
	}

	@Override
	@CachePut(cacheNames = { "gameCache" }, key = "gameName")
	public Game updateGame(Game game) {
		return repository.save(game);
	}

	@Override
	@Cacheable(cacheNames = { "gameCache" }, key = "gameName")
	public Game readGame(String gameName) {
		return repository.findById(gameName).get();
	}

	@Override
	@CacheEvict(cacheNames = { "gameCache" }, key = "gameName")
	public void deleteGame(String gameName) {
		repository.deleteById(gameName);

	}

}
