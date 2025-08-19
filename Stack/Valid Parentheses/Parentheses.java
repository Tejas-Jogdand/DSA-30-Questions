import java.util.*;

public class Parentheses {

    public static boolean isValid(String str) {
        Deque<Character> s = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else if (c == ')' ||
                    c == '}' ||
                    c == ']') {
                if (s.isEmpty())
                    return false;
                char temp = s.pop();
                if (!(temp == '(' && c == ')' ||
                        temp == '[' && c == ']' ||
                        temp == '{' && c == '}')) {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("}"));
    }
}
