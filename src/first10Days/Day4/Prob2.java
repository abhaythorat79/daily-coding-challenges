package first10Days.Day4;

//Conditions
//Take an integer n
//
//Count how many digits it has
//
//Print the count
public class Prob2 {
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
            System.out.print(count + ",");
        } 
    }
}
