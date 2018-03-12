package com.adaptionsoft.games.uglytrivia;

/**
 * Created by itzik on 1/7/2016.
 */
public final class PlayersAutenticator implements IPlayersAuthenticator {
    public PlayersAutenticator() {
        //throw new RuntimeException("I am trying to connect a remote server - you have to bypass me...");
    }

    /* (non-Javadoc)
	 * @see com.adaptionsoft.games.uglytrivia.IPlayersAuthenticator#authenticate(java.lang.String)
	 */
    @Override
	public boolean authenticate(String playerName) {
        return true;
    }
}
