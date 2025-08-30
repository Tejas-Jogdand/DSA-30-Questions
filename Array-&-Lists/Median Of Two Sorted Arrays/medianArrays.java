public class medianArrays {
    public static double median(int[] nums1, int[] nums2) {

        // double sum = 0;

        // for (int i = 0; i < nums1.length; i++) {
        // sum += nums1[i];
        // }
        // for (int i = 0; i < nums2.length; i++) {
        // sum += nums2[i];
        // }

        // double median = sum/(nums1.length+nums2.length);

        // return median;
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return median(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0, high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            // If partitionX is 0, it means nothing on the left side of nums1
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            // If partitionY is 0, it means nothing on the left side of nums2
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            // Check if we have found the correct partitions
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // Even length combined
                if ((m + n) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                }
                // Odd length combined
                else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            }
            // Move binary search left
            else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            }
            // Move binary search right
            else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");

    }

    public static void main(String[] args) {
        int[] num1 = { 1, 2 };
        int[] num2 = { 3, 4 };
        System.out.println(median(num1, num2));
    }
}
