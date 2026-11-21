import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        Set<Character> characters = new HashSet<>();
        int longestLength = 0;
        int left = 0;

        for (int right = 0; right < text.length(); right++) {
            char current = text.charAt(right);

            while (characters.contains(current)) {
                characters.remove(text.charAt(left));
                left++;
            }

            characters.add(current);
            longestLength = Math.max(longestLength, right - left + 1);
        }

        return longestLength;
    }

    public static void main(String[] args) {
        String text = "abcabcbb";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(text));

        String repeated = "bbbbb";
        System.out.println("Repeated-character length: " + lengthOfLongestSubstring(repeated));
    }
}
