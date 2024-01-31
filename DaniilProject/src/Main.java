import Game.GameController;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
    }
    public void start(){
        int count2 = 0;
        int count3 = 0;
        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                count2++;
            }
            if(i % 3 == 0){
                System.out.println(i);
                count3++;
            }
        }
        if(count2 > count3){
            System.out.println("Двоек больше: " + count2);
        }
        else if(count2 < count3){
            System.out.println("Троек больше: " + count3);
        }
        else{
            System.out.println("Победила дружба!");
        }
    }
}