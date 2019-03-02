package rhodrih.game;

import java.util.List;

import rhodrih.game.exceptions.GameNotFound;
import rhodrih.game.model.Game;

public interface GameRepository {

	Game get(Long gameId) throws GameNotFound ;

	List<Game> getAll();
}
