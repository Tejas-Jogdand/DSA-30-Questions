public class pluseone {
     public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry, done
            }
            digits[i] = 0; // digit becomes 0, carry continues
        }

        // if all digits were 9, e.g. [9,9,9] -> [1,0,0,0]
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(plusOne(arr));
    }
}
