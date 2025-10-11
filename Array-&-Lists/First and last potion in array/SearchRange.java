public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    private static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (isFirst) {
                    right = mid - 1; // continue to search on left
                } else {
                    left = mid + 1;  // continue to search on right
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {5,7,7,8,8,10};
        int[] res1 = searchRange(nums1, 8);
        System.out.println("[" + res1[0] + "," + res1[1] + "]"); // [3,4]

        int[] nums2 = {5,7,7,8,8,10};
        int[] res2 = searchRange(nums2, 6);
        System.out.println("[" + res2[0] + "," + res2[1] + "]"); // [-1,-1]

        int[] nums3 = {};
        int[] res3 = searchRange(nums3, 0);
        System.out.println("[" + res3[0] + "," + res3[1] + "]"); // [-1,-1]
    }
}
