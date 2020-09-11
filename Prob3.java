import java.util.HashSet;

public class Prob3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;

        while (bPointer < s.length()) {
            if (!set.contains(s.charAt(bPointer))) {
                set.add(s.charAt(bPointer));
                bPointer++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }
}
