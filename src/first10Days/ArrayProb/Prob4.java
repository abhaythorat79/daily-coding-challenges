package first10Days.ArrayProb;

//Write a Java program to print all elements of an integer array.
//
//Create an integer array with 5 values
//
//Use a loop to print each element
//
//Print elements one per line
public class Prob4 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}