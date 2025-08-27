public class numberOfBits {
    public static int countBit(int n){
        int count = 0;

        // String bitConversion = Integer.toBinaryString(n);
        
        // for (int i = 0; i < bitConversion.length(); i++) {
        //     if(bitConversion.charAt(i)=='1')
        //         count++;
        // }
        
        // more efficent solution
        while (n != 0) {
            n &= (n - 1); // removes the lowest set bit
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBit(11));
    }
}
