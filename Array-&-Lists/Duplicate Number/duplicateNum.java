import java.util.HashSet;

class duplicateNum{

    public static boolean isDuplicateNum(int[] arr){
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     if(i<arr.length-1 && arr[i] == arr[i+1])
        //         return true;
        // }
        // return false;

        HashSet<Integer> seen = new HashSet<>();
        for (int i : arr) {
            if(seen.contains(i))
                return true;
            seen.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,5};
        System.out.println(isDuplicateNum(arr));
    }
}