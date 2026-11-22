import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        if (first.codePointCount(0, first.length()) != second.codePointCount(0, second.length())) {
            return false;
        }

        Map<Integer, Integer> frequencies = new HashMap<>();
        first.codePoints().forEach(codePoint ->
                frequencies.merge(codePoint, 1, Integer::sum));

        return second.codePoints().allMatch(codePoint -> {
            Integer count = frequencies.get(codePoint);
            if (count == null) {
                return false;
            }
            if (count == 1) {
                frequencies.remove(codePoint);
            } else {
                frequencies.put(codePoint, count - 1);
            }
            return true;
        });
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("hello", "world"));
    }
}
