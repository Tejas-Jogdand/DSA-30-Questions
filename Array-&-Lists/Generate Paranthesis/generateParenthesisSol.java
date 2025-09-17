import java.util.ArrayList;
import java.util.List;

public class generateParenthesisSol {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) return res;
        backtrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            res.add(cur.toString());
            return;
        }

        // If we can add an opening parenthesis, add it
        if (open < max) {
            cur.append('(');
            backtrack(res, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }

        // If we can add a closing parenthesis (must not exceed number of opens), add it
        if (close < open) {
            cur.append(')');
            backtrack(res, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }

    // Optional: quick main to test
    public static void main(String[] args) {
        generateParenthesisSol s = new generateParenthesisSol
        ();
        System.out.println(s.generateParenthesis(3));
        // Expected: ["((()))","(()())","(())()","()(())","()()()"] (order may vary)
    }
}
