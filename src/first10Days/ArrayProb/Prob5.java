package first10Days.ArrayProb;
//🧩 Question: Print Even Numbers from 1 to N
//Conditions
//Take an integer n
//
//Print only even numbers between 1 and n
//
//Each number on a new line
public class Prob5 {
    public static void main(String[] args){
        int n=10;
        for(int i=2;i<=n;i++){
            if (i % 2 == 0) {
                System.out.println(+ i);
            }
        }
    }
}
