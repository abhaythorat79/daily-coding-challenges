package first10Days.ArrayProb;

//Conditions
//Take an integer n
//
//Calculate sum of numbers from 1 to n
//
//Print the final sum
public class Prob6 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(+sum);
    }
}
