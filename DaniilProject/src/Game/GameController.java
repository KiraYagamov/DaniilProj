package Game;

import java.util.ArrayList;

public class GameController {
    int currentNum;
    int playersCount = 5;
    ArrayList<Player> players = new ArrayList<>();
    boolean gameEnded;

    public void start(){
        currentNum = randomNum();
        gameEnded = false;

        for(int i = 1; i <= playersCount; i++){
            Player player = new Player(i);
            players.add(player);
        }

        for (Player player : players) {
            System.out.println("Игрок " + player.index + " создан!");
        }
        if(playersCount > 0) {
            while (!gameEnded) {
                for (Player player : players) {

                    int playerNum = player.tryNum();

                    if (playerNum == currentNum) {
                        System.out.println("Игрок с индексом " + player.index + " отгадал число " + playerNum + "!");
                        gameEnded = true;
                        break;
                    } else {
                        System.out.println("Игрок с индексом " + player.index + " не отгадал, загадав число " + playerNum);
                    }

                }
            }
        }
    }

    private int randomNum(){
        return (int) (Math.random() * 99 + 1);
    }
}