package first10Days.Day7;

public class Prob1LargArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int sum = 0;
        int max = a[0];
        // Print elements, calculate sum and max
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum += a[i];
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(); // new line
        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);
    }
}

