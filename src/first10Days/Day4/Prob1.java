package first10Days.Day4;

// Conditions
//Take one integer n
//
//Print multiplication table of n
//
//Table should be from 1 to 10
public class Prob1 {
    public static void main(String[] args) {
        int n = 5;
        int mul = 0;
        for (int i = 1; i <= 10; i++) {
            mul = n * i;
            System.out.println(n + " X " + i + " = " + mul);
        }
    }
}