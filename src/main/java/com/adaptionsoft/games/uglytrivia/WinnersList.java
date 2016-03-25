package com.adaptionsoft.games.uglytrivia;

import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by itzik on 1/7/2016.
 */
public class WinnersList {
    private final MemcachedClient memcachedClient;

    private WinnersList() {
        try {
            memcachedClient = new MemcachedClient();
        } catch (IOException e) {
            throw new RuntimeException();
        }
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
            memcachedClient.set(player, 0, 0);
        }
        memcachedClient.set(player, 0, ((Integer) memcachedClient.get(player)) + 1);
    }

    public int getWinnings(String player) {
        return (Integer)memcachedClient.get(player);
    }
}
