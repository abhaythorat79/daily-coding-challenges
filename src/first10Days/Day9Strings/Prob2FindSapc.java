package first10Days.Day9Strings;

public class Prob2FindSapc {
    public static void main(String[] ags) {
        String s = "I love Java programming";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        System.out.print(count+1);
    }
}
