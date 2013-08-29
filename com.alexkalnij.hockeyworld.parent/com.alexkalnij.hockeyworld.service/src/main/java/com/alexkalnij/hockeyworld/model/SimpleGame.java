package com.alexkalnij.hockeyworld.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * User: Alex Kalnij
 * Date: 27.08.13
 * Time: 20:02
 */
public class SimpleGame implements Game {

    private Team team1;
    private Team team2;
    private int gameTimeSeconds;
    private Map<Team, Integer> score = new HashMap<Team, Integer>();

    public SimpleGame(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        score.put(team1, 0);
        score.put(team2, 0);
    }

    @Override
    public void play() {
        Random r = new Random();
        System.out.println("Face-off");
        if (r.nextBoolean()) {
            System.out.println(team1.getName() + " wins face-off");
        } else {
            System.out.println(team2.getName() + " wins face-off");
        }
        try {
            for (int i = 0; i < 10; i++) {
                attack(r, team1);
                Thread.sleep(1000);
                attack(r, team2);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Shit happens");
        }
        Integer scoreTeam1 = score.get(team1);
        Integer scoreTeam2 = score.get(team2);
        System.out.println("Final result: " + scoreTeam1 + " : " + scoreTeam2);
        if (scoreTeam1 > scoreTeam2) {
            System.out.println(team1.getName() + " wins");
        } else if (scoreTeam2 > scoreTeam1) {
            System.out.println(team2.getName() + " wins");
        } else {
            System.out.println("Tie game");
        }
    }

    private void attack(Random r, Team team) {
        System.out.println(team.getName() + " attacks");
        if (r.nextBoolean()) {
            System.out.println(team.getName() + " scores");
            Integer currentScore = score.get(team);
            score.put(team, ++currentScore);
        } else {
            if (r.nextBoolean()) {
                System.out.println("Goalie saves");
            } else {
                System.out.println("Defense makes the job");
            }
        }
    }
}
