package first10Days.Day9Strings;

public class Palindrome {
    public static void main(String[] args){
        String s="java";
        String p="";
        for(int i=s.length()-1;i>=0;i--){
            p=p+s.charAt(i);
        }
        if(s.equals(p)){
            System.out.print(s+"  Palindrome");
        }else {
            System.out.print(s+" not Palindrome");
        }
    }
}
