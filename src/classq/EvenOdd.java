package classq;

import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args){
        int arr[]={10,5,8,7,2,9,4,1};

        System.out.println("Even Number:");

        Arrays.stream(arr).filter(x-> x%2 ==0)
                .forEach(x-> System.out.print(x+" "));

        System.out.println("Odd Number:");
        Arrays.stream(arr).filter(x-> x%2 !=0)
                .forEach(x-> System.out.print(x+" "));
    }
}
