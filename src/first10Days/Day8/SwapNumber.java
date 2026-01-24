package first10Days.Day8;

public class SwapNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Max = " + max);
    }
}
