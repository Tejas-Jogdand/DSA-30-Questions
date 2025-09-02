public class sqrt {
    public static int mySqrt(int x) {
        if (x < 2) return x;  // sqrt(0) = 0, sqrt(1) = 1

        long left = 1, right = x / 2; 
        int ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;

            if (sq == x) return (int) mid;
            if (sq < x) {
                ans = (int) mid;  // store the floor value
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;  // integer part of sqrt(x)
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(7));
    }
}
