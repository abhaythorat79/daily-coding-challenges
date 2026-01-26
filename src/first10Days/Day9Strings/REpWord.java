package first10Days.Day9Strings;

public class REpWord {
    public static void main(String[] args) {
        String s = "Kajal Abhay Thorat";
        s = s.toLowerCase();

        //to flow of string which give
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char ch = s.charAt(i);
            //This is use for a avoid species
            if (ch == ' ')
                continue;

            //here we check is it  aleready count or not
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted)
                continue;

            //if  it count then skip other wise we have to check with holl string
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + "=" + count);
        }
    }
}