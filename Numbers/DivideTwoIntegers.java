public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        // Edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Work with long to avoid overflow during abs
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        // Subtract divisor multiples using bit shifting
        while (a >= b) {
            long temp = b, multiple = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            a -= temp;
            result += multiple;
        }

        // Apply sign
        return (dividend > 0) == (divisor > 0) ? result : -result;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));   // 3
        System.out.println(divide(7, -3));   // -2
        System.out.println(divide(-2147483648, -1)); // 2147483647 (clamped)
    }
}
