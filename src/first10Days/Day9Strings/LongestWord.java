package first10Days.Day9Strings;

public class LongestWord {
    public static void main(String[] args) {

        String s = "Java is a very powerful language";

        String[] words = s.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println(longest);
    }
}
