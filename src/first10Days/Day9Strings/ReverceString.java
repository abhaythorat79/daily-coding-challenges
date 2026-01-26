package first10Days.Day9Strings;

public class ReverceString {
    public static void main(String[] args){
        String s="i love java";
        String rev="";
        for (int i=s.length()-1; i >=0;i--){
        rev=rev+s.charAt(i);
        }
        System.out.print(rev);
    }
}
