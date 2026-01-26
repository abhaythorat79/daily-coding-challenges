package first10Days.Day9Strings;

public class StringovelSpace {
    public static void main(String[] args){
        String s="education i love you ";
        int count=0;
        int space=0;
        for(int i=0; i< s.length();i++){
            char ch=s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }else if(ch ==' '){
                space++;
            }
        }
        System.out.println("Vowels "+count);
        System.out.println("Spaces "+space);
    }
}