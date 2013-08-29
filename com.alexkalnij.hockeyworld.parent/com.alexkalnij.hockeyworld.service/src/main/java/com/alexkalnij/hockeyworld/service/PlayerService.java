package com.alexkalnij.hockeyworld.service;

import com.alexkalnij.hockeyworld.model.player.Player;

/**
 * User: Alex Kalnij
 * Date: 19.08.13
 * Time: 22:04
 */
public interface PlayerService {
    Player createPlayer(Player player);

    Player getPlayerById(Long id);

    Player updatePlayer(Player player);

    void removePlayer(Player player);
}
