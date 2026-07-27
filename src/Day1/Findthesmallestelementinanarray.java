package Day1;

public class Findthesmallestelementinanarray {

    public static void main(String[] args) {
        int arr[] = {10, 20, 7, 2, 8};
        int smallest = arr[0],sum=0,avr=0;
        for (int i = 1; i < arr.length; i++) {
            sum=arr[i]+sum;
            avr=i;
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("samll element " + smallest);
        System.out.println("sum of all element " + sum);
        System.out.println("Average of all element " + sum/avr);
    }
}