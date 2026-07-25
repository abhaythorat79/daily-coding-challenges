package Day1;
//Find the smallest number in an array.
public class Day12 {

    public static void main(String[] args){
        int arr[] = {10,20,50,4,3,220,1};
        int min = arr[0];
        for (int i =1; i<arr.length;i++){
            if(arr[i] < min){
                min=arr[i];

            }
        }
        System.out.println("hello abhay " +min) ;
    }
}
