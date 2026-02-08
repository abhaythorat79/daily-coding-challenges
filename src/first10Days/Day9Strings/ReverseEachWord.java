package first10Days.Day9Strings;

public class ReverseEachWord {
    public static void main(String[] args) {

        String s = "Abhay Gokul Thorat is a good programmer";
        String[] words = s.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }

            result = result + revWord + " ";
        }

        System.out.println(result.trim());
    }
}
