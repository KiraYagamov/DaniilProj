package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double result = calculator.calculate(scanner.nextLine());
            System.out.println(result);
        }
    }
}