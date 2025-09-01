public class perfectSquare {
     public static boolean isPerfectSquare(int num) {
        if(num <= 0) return false;

        // long i = 1;

        // while(i*i <= num){
        //     if(i*i == num) return true;
        //     i++;
        // }

        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            if (sq == num) return true;
            else if (sq < num) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
