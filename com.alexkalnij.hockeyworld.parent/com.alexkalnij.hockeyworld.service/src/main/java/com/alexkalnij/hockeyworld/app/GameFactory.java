package com.alexkalnij.hockeyworld.app;

import com.alexkalnij.hockeyworld.model.Game;
import com.alexkalnij.hockeyworld.model.SimpleGame;
import com.alexkalnij.hockeyworld.model.Team;

/**
 * User: Alex Kalnij
 * Date: 27.08.13
 * Time: 20:01
 */
public class GameFactory {
    public static Game createGame(Team team1, Team team2) {
        return new SimpleGame(team1, team2);
    }
}
