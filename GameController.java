package fsb.gs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fsb.gs.model.Game;
import fsb.gs.service.GameService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/v1")
public class GameController {

	private final GameService service;
	
	public GameController(GameService service) {
		this.service = service;
	}
	@PostMapping("/game")
	public ResponseEntity<?> addGame(@RequestBody Game game){
		return new ResponseEntity<>(service.createGame(game), HttpStatus.CREATED);
	}
	
	@GetMapping("/game/{name}")
	public ResponseEntity<?> retriveGame(@PathVariable String name){
		return new ResponseEntity<>(service.readGame(name), HttpStatus.OK);
	}
	
	@PutMapping("/game")
	public ResponseEntity<?> updateGame(@PathVariable Game game){
		return new ResponseEntity<>(service.updateGame(name), HttpStatus.CREATED);
	}
	@DeleteMapping("/game/{name}")
	public ResponseEntity<?> deleteGame(@PathVariable String name){
		return new ResponseEntity<>(service.deleteGame(name), HttpStatus.OK);
	}
	
}
