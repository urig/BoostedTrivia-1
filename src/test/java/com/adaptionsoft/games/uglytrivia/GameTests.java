package com.adaptionsoft.games.uglytrivia;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.mockito.Mock;

public class GameTests {

	@Test
	public void roll_playerRolls1_placeIs1() {
		// Arrange
		IPlayersAuthenticator playersAuthenticator = mock(IPlayersAuthenticator.class);
		when(playersAuthenticator.authenticate("foo")).thenReturn(true);
		Game target = new Game(playersAuthenticator);
		target.add("foo");
		
		// Act
		target.roll(1);
		
		// Assert
		assertThat(target.getPlaceofPlayer(0)).isEqualTo(1);
	}
}
