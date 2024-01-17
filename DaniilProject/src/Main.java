import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.start();
        main.start();
        main.start();
        main.start();
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        String text = "";

        while(!text.equals("Stop")){
            text = scanner.nextLine();
            System.out.println("Вы ввели: " + text);
        }

        end();
    }
    public void end(){
        System.out.println("Программа завершена");
    }
}