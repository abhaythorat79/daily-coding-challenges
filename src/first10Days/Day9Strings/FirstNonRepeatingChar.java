package first10Days.Day9Strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String s = "swiss";
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}

