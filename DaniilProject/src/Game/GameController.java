package Game;

import java.util.ArrayList;

public class GameController {
    int currentNum;
    int playersCount = 5;
    ArrayList<Player> players = new ArrayList<>();

    public void start(){
        currentNum = randomNum();

        for(int i = 1; i <= playersCount; i++){
            Player player = new Player();

            player.index = i;
            players.add(player);
        }

        for (Player player : players) {
            System.out.println("Игрок " + player.index + " создан!");
        }

        System.out.println(currentNum);
    }

    private int randomNum(){
        return (int) (Math.random() * 99 + 1);
    }
}