package Game;

public class Player {
    int index;
    public Player(int index){
        this.index = index;
    }

    public int tryNum(){
        int randomNum = (int) (Math.random() * 99 + 1);
        return randomNum;
    }
}