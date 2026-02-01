package first10Days.Day9Strings;

public class RevAllString{
    public static void main(String[] args){
        String s = "Abhay Gokul Thorat is a good programmer.";

        s=s.replace("."," ");

        String[] words=s.split(" ");

        String result ="";
        for(int i=words.length-1;i>=0;i--){
            result=result+words[i] +" ";
        }
        System.out.print(result);
    }
}
