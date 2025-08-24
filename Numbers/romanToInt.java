import java.util.*;
public class romanToInt {
    public static int romanToIntConvert(String s) {
        // Map each Roman numeral to its value
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            
            // Look ahead if not last character
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value; // subtract if smaller than next
            } else {
                total += value; // otherwise add
            }
        }
        return total;
    }


    public static void main(String[] args) {
        System.out.println(romanToIntConvert("IV"));
    }
}
