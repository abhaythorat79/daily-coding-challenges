package first10Days.Day10Collection;
import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {

        String s = "Kajal Abhay Thorat";
        s = s.toLowerCase();   // convert to lowercase

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // skip spaces
            if (ch == ' ')
                continue;

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // print character frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

