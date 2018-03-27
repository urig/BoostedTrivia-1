package uglytrivia;

import com.adaptionsoft.games.uglytrivia.Game;
import com.adaptionsoft.games.uglytrivia.PlayersAutenticator;

public class GameForTest extends Game {

	public GameForTest(PlayersAutenticator playersAutenticator) {
		super(playersAutenticator);
	}

	public int getPlayerPlace(int playerId) {
		return places[playerId];
	}
}
