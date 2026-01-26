package first10Days.Day9Strings;

public class Repitechar {
    public static void main(String[] args){
        String s="Abhayaa";
        s = s.toLowerCase();
        int count=0;
        char target='a';
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == target){
                count++;
            }
        }
        System.out.print(count);
    }
}
