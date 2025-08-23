public class climbStairs {
     public static int waysclimbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

   
    // public static int waysclimbStairs(int n) {
    //     if(n == 0 || n==1){
    //         return 1;
    //     }
    // return waysclimbStairs(n-1) + waysclimbStairs(n-2);
    // }

    public static void main(String[] args) {
        System.out.println(waysclimbStairs(43));
    }
}
