package com.alexkalnij.hockeyworld.app;

import com.alexkalnij.hockeyworld.model.Game;
import com.alexkalnij.hockeyworld.model.Team;

/**
 * User: Alex Kalnij
 * Date: 27.08.13
 * Time: 19:56
 */
public class TestApp {
    public static void main(String[] args) {
        Team team1 = new Team("Red Wings");
        Team team2 = new Team("Mapple Leafs");
        Game game = GameFactory.createGame(team1,team2);
        game.play();
    }
}
