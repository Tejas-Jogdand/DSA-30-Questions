public class commonPrefix {
    public static String prefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String str = strs[0]; // assume first string is prefix

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < str.length() && j < strs[i].length() && str.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            str = str.substring(0, j); // trim prefix
            if (str.isEmpty())
                return ""; // no common prefix
        }

        return str;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flowt", "floworwe" };
        System.out.println(prefix(strs));
    }
}
