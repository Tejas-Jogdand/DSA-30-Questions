public class firstOccurrence {
    public static int strStr(String haystack, String needle) {
     if (needle.isEmpty()) return 0; // Edge case
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("asdfasfeb","feb"));
    }
}
