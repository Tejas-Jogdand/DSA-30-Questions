import java.util.*;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;      // last valid element in nums1
        int j = n - 1;      // last element in nums2
        int k = m + n - 1;  // last position in nums1

        // Merge from end to start
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 has remaining elements, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]
    }
}
