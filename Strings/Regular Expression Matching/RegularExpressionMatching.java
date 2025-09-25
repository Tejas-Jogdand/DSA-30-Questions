public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true; // empty string matches empty pattern

        // Initialize patterns like a*, a*b*, a*b*c* for empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char pc = p.charAt(j - 1);

                if (pc == '.' || pc == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    // zero occurrence
                    dp[i][j] = dp[i][j - 2];
                    // one or more occurrence
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));      // false
        System.out.println(isMatch("aa", "a*"));     // true
        System.out.println(isMatch("ab", ".*"));     // true
        System.out.println(isMatch("aab", "c*a*b")); // true
        System.out.println(isMatch("mississippi", "mis*is*p*.")); // false
    }
}
