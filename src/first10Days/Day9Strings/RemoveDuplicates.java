package first10Days.Day9Strings;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String s = "programming";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check if character already exists in result
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}
