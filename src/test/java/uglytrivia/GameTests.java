package uglytrivia;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adaptionsoft.games.uglytrivia.PlayersAutenticator;

public class GameTests {

	@Test
	public void roll_roll12_playerIsAtPlace0() {
		
		GameForTest target = new GameForTest(new PlayersAutenticator());
		target.add("foo");
		target.roll(6);
		target.roll(6);
		assertEquals(0, target.getPlayerPlace(0));
	}

	@Test
	public void roll_roll1_playerIsAtPlace1() {
		
		GameForTest target = new GameForTest(new PlayersAutenticator());
		target.add("foo");
		target.roll(1);
		assertEquals(1, target.getPlayerPlace(0));
	}

	@Test
	public void roll_roll6_playerIsAtPlace60() {
		
		GameForTest target = new GameForTest(new PlayersAutenticator());
		target.add("foo");
		target.roll(6);
		assertEquals(6, target.getPlayerPlace(0));
	}

}
