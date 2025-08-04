package Controller;

import Model.Player;
import View.PlayerView;

import java.util.ArrayList;
import java.util.List;

public class PlayerController {
    private final List<Player> players = new ArrayList<>();
    private final PlayerView view;

    public PlayerController(PlayerView view) {
        this.view = view;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updateStats(int id, int runs, int wickets) {
        for (Player player : players) {
            if (player.getId() == id) {
                player.setRuns(runs);
                player.setWickets(wickets);
            }
        }
    }

    public void displayAllPlayers() {
        view.displayAllPlayers(players);
    }

    public void displayPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                view.displayPlayer(player);
                return;
            }
        }
        System.out.println("Player not found with ID: " + id);
    }

    public void displayTopScorer() {
        Player topScorer = null;
        for (Player p : players) {
            if (topScorer == null || p.getRuns() > topScorer.getRuns()) {
                topScorer = p;
            }
        }
        System.out.println("Top Scorer:");
        view.displayPlayer(topScorer);
    }

    public void displayTopWicketTaker() {
        Player topWicketTaker = null;
        for (Player p : players) {
            if (topWicketTaker == null || p.getWickets() > topWicketTaker.getWickets()) {
                topWicketTaker = p;
            }
        }
        System.out.println("Top Wicket Taker:");
        view.displayPlayer(topWicketTaker);
    }
}
