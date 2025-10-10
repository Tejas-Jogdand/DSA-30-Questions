public class validNumber {
    public static boolean isNumber(String s) {
        s = s.trim(); // remove leading/trailing spaces
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenE = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                seenDigit = true;
            } 
            else if (c == '.') {
                // Dot cannot appear after 'e' or appear twice
                if (seenDot || seenE) return false;
                seenDot = true;
            } 
            else if (c == 'e' || c == 'E') {
                // 'e' cannot appear twice or without any number before it
                if (seenE || !seenDigit) return false;
                seenE = true;
                seenDigit = false; // need a number after e
            } 
            else if (c == '+' || c == '-') {
                // sign allowed only at start or right after 'e'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            } 
            else {
                return false;
            }
        }

        return seenDigit; // must end with a number
    }

    public static void main(String[] args) {
        String[] tests = {
            "0", "e", ".", "2e10", "-90E3", "1e", "6e-1", "99e2.5", "53.5e93", "--6", "-+3", "95a54e53"
        };

        for (String s : tests) {
            System.out.println(s + " → " + isNumber(s));
        }
    }
}
