package rhodrih.game;

import java.util.List;

import rhodrih.game.model.Game;
import rhodrih.game.model.Report;

public interface IGameReportGenerator {

	Report generate(List<Game> games);
}
