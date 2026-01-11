package first10Days.Day2;
//Conditions
//Take one integer input
//
//If the number is divisible by 2 → print Even
//
//Otherwise → print Odd

public class Prob1 {
    public static void main(String[] args) {
        int n = 6;

        if (n % 2 == 0) {
            System.out.print("Is Even number");
        } else {
            System.out.print("Is odd number");
        }
    }
}
