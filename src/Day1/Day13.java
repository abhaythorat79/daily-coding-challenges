package Day1;
//Reverse an array.
public class Day13 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 50, 4, 3, 220, 1};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
