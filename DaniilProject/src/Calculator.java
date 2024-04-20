import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calc();
    }
    public void calc(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите второе число: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Резултат: " + (num1 + num2));
        }
        catch (NumberFormatException ex){
            System.out.println("Введите число!");
            calc();
        }
        catch (Exception ex){
            System.out.println("Ошибка!");
        }
    }
}
