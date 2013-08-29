package com.alexkalnij.hockeyworld.dao;

import com.alexkalnij.hockeyworld.model.player.Player;

/**
 * User: Alex Kalnij
 * Date: 19.08.13
 * Time: 22:00
 */
public interface PlayerDao {
    Player createPlayer(Player player);

    Player getPlayerById(Long id);

    Player updatePlayer(Player player);

    void removePlayer(Player player);
}
