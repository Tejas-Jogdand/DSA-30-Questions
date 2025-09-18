public class IntToRom {
      public static String intToRoman(int num) {
        // Define Roman symbols and their values
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40, 10, 9, 5, 4, 1};
        String[] romans = {"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        // Greedy approach: subtract largest possible values
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        System.out.println(intToRoman(1));
    }
}
