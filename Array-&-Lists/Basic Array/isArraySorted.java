public class isArraySorted {

    static boolean isSorted(int[] arr){
        for (int i = 1; i <arr.length; i++) {
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr [] = {2,3,4,5};
        System.out.println(isSorted(arr));
    }
}
