package EGE;

public class First {
    public static void main(String[] args) {
        First first = new First();
        for (int N = 0; N <= 255; N++) {
            String bin = first.toBin(N);
            String reversed = first.inverse(bin);
            int result = Integer.parseInt(reversed, 2) - N;
            if (result == 111){
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
        int len = 8 - result.length();
        for (int i = 0; i < len; i++) {
            result = "0" + result;
        }
        return result;
    }

    public String inverse(String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1'){
                result += "0";
            }
            else{
                result += "1";
            }
        }
        return result;
    }
}