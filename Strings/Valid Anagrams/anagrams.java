import java.util.Arrays;

public class anagrams {
    public boolean isAnagram(String s, String t) {
        char []str1 = s.toCharArray();
        char []str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2))
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "anr";
        String str2 = "aan";
        anagrams ag = new anagrams();
        System.out.println(ag.isAnagram(str,str2));
    }
}
