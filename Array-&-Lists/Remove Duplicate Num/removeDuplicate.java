public class removeDuplicate {
    public static int removeDuplicates(int[] nums) {
     if (nums.length == 0) return 0;

        int i = 0;  // pointer for last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // length of unique elements   
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}