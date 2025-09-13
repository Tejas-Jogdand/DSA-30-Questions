public class lastwordCount {
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        // 1. Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 2. Count length of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hi my name is Tejas"));
    }
}
