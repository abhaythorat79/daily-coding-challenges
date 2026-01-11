package first10Days.Day2;

//Conditions
//Take two integer numbers a and b
//
//If a > b → print a is greater
//
//If b > a → print b is greater
//
//If both are equal → print Both are equal
public class Prob3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        if (a < b) {
            System.out.println("b is greater " + b);
        } else if (a > b) {
            System.out.println(" a is greater " + a);
        } else {
            System.out.println(" a & b is equal ");

        }
    }
}
