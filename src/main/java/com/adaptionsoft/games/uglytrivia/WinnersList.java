package com.adaptionsoft.games.uglytrivia;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by itzik on 1/7/2016.
 */
public class WinnersList {
    private final HashMap memcachedClient;

    private WinnersList() {
        memcachedClient = new HashMap();
    }

    private static WinnersList instance;

    public static WinnersList getInstance() {
        if (instance == null) {
            instance = new WinnersList();
        }
        return instance;
    }

    public void add(String player) {
        if (memcachedClient.get(player) == null) {
            memcachedClient.put(player, 0);
        }
        memcachedClient.put(player, ((Integer) memcachedClient.get(player)) + 1);
    }

    public int getWinnings(String player) {
        return (Integer)memcachedClient.get(player);
    }
}
