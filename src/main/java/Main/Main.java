package Main;
import Controller.PlayerController;
import Model.Player;
import View.PlayerView;

public class Main {
    public static void main(String[] args) {
        PlayerView view = new PlayerView();
        PlayerController controller = new PlayerController(view);

        // Sample Data
        controller.addPlayer(new Player(1, "Virat Kohli", "RCB", "Batsman", 973, 0));
        controller.addPlayer(new Player(2, "Jasprit Bumrah", "MI", "Bowler", 45, 27));
        controller.addPlayer(new Player(3, "MS Dhoni", "CSK", "Wicket-Keeper", 452, 0));

        controller.displayAllPlayers();
        controller.displayTopScorer();
        controller.displayTopWicketTaker();

        controller.updateStats(1, 1000, 1); // Updating stats for Kohli
        controller.displayPlayerById(1);
    }
}
