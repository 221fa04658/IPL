package View;

import Model.Player;
import java.util.List;

public class PlayerView {
    public void displayPlayer(Player player) {
        System.out.println("Player Details:");
        System.out.println("ID: " + player.getId());
        System.out.println("Name: " + player.getName());
        System.out.println("Team: " + player.getTeam());
        System.out.println("Role: " + player.getRole());
        System.out.println("Runs: " + player.getRuns());
        System.out.println("Wickets: " + player.getWickets());
        System.out.println();
    }

    public void displayAllPlayers(List<Player> players) {
        System.out.println("All Players:");
        for (Player player : players) {
            displayPlayer(player);
        }
    }
}
