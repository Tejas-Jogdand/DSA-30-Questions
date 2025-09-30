public class searchRotatedArray {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Found target
            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // target in left half
                } else {
                    left = mid + 1;  // target in right half
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;  // target in right half
                } else {
                    right = mid - 1; // target in left half
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        System.out.println(search(nums1, 0)); // 4

        int[] nums2 = {4,5,6,7,0,1,2};
        System.out.println(search(nums2, 3)); // -1

        int[] nums3 = {1};
        System.out.println(search(nums3, 0)); // -1
    }
}
