package SeaBattle;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Field field = Field.GenerateField(10);
        Scanner scanner = new Scanner(System.in);
        while (!field.gameEnded()){
            try {
                int pos = Integer.parseInt(scanner.nextLine());
                field.shoot(pos);
                field.printField();
            }
            catch (Exception ex){
                System.out.println("Введите корректную позицию!");
            }
        }
        System.out.println("Игра завершена!");
    }
}
