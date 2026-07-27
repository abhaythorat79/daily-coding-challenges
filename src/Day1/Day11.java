package Day1;
//Find the largest number in an array.
public class Day11 {

    public static void main(String[] args){
       int arr[] = {10,20,50,4,3,220,1};
        int max = arr[0];
        for (int i =1; i<arr.length;i++){
        if(arr[i] > max){
            max=arr[i];
        }
        }
        System.out.println("hello abhay " +max) ;
    }
}
