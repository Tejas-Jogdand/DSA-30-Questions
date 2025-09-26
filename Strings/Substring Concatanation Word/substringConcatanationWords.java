import java.util.*;

public class substringConcatanationWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int windowSize = wordLen * wordCount;

        // Frequency map of words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String w : words) {
            wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
        }

        // Try every possible starting point within one word length
        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i, count = 0;
            Map<String, Integer> seen = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordMap.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    // If word appears too many times, shrink window
                    while (seen.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    // If window matches exactly
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    // Reset window
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring(s, words)); // [0, 9]

        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word","good","best","word"};
        System.out.println(findSubstring(s2, words2)); // []
    }
}
