package first10Days.Day2;
//Conditions
//Take one integer number
//
//If number > 0 → print Positive
//
//If number < 0 → print Negative
//
//If number == 0 → print Zero


public class Prob2 {

    public static void main(String[] args) {

        int n = 10;
        if (n > 0) {
            System.out.print("Positive");
        } else if (n < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }
    }
}
