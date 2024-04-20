package EGE;

public class Second {
    public static void main(String[] args) {
        Second second = new Second();
        for (int N = 0; N < 1000; N++) {
            String bin = second.toBin(N);
            bin = second.operation(bin);
            bin = second.operation(bin);
            int R = Integer.parseInt(bin, 2);
            if (R > 97){
                System.out.println(N);
                break;
            }
        }
    }
    public String toBin(int num){
        String result = "";
        while (num > 0){
            result = (num % 2) + result;
            num /= 2;
        }
        return result;
    }
    public String operation(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') count++;
        }
        return input + (count % 2);
    }
}
