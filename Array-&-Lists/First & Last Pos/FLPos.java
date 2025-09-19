import java.util.Arrays;

public class FLPos {
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
                    right = mid - 1; // keep searching left
                } else {
                    left = mid + 1; // keep searching right
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
        int[] arr = {1,3,4,5,6};
        System.out.println(Arrays.toString(searchRange(arr,3)));
    }
}
