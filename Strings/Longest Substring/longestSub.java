import java.util.*;
public class longestSub {

    public static int longestSubstring(String s){
    int max = 0;
    int left = 0; // sliding window start
    HashSet<Character> hs = new HashSet<>();

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);

        // if duplicate, shrink from left until duplicate is gone
        while (hs.contains(c)) {
            hs.remove(s.charAt(left));
            left++;
        }

        hs.add(c);
        max = Math.max(max, hs.size());
    }

    return max;
}

    public static void main(String[] args) {
        System.out.println(longestSubstring("    "));
    }
}
