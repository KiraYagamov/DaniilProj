package Calculator;

public class Calculator {
    public double calculate(String input){
        String[] data = input.split(" ");
        try {
            if (data.length != 3) return 0;
            double num1 = Double.parseDouble(data[0]);
            double num2 = Double.parseDouble(data[2]);
            switch (data[1]) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    return num1 / num2;
                default:
                    return 0;
            }
        }
        catch (Exception ex){
            return 0;
        }
    }
}