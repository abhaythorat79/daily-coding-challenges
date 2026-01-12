package first10Days.Day3;

//Question
//
//Write a Java program to find the largest of three integers.
public class Prob2 {
    public static void main(String[] args) {
        int a = 1000, b = 200, c = 99;
        if (a > b && a > c) {
            System.out.print("A is largest number");
        } else if (a < b && b > c) {
            System.out.print("B is largest number");
        } else {
            System.out.print("C is largest number");
        }
    }
}
