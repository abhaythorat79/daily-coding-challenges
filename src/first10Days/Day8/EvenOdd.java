package first10Days.Day8;

public class EvenOdd {
    public static void main(String[] args){
        int n[]={10,20,9,30,10,11};
        int OddCount=0,EvenCount=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                System.out.println("is Even "+n[i]);
                EvenCount++;
            }else {
                System.out.println("is odd "+n[i]);
                OddCount++;
            }
        }
        System.out.println(EvenCount +" "+OddCount);
    }
}
