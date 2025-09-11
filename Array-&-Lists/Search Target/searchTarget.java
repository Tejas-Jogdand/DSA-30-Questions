public class searchTarget {
     public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // found exact match
            } else if (nums[mid] < target) {
                left = mid + 1; // target is in right half
            } else {
                right = mid - 1; // target is in left half
            }
        }

        // if not found then left will be the insert position
        return left;

    }
    public static void main(String[] args){
        int[] nums = {2,4,5,6};
        System.out.println(searchInsert(nums,8));
    }
}
