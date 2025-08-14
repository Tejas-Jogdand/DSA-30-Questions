public class countOccurance {
    static int count(int arr[],int target){
        int repeated = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                repeated++;
        }
        return repeated;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2};
        int target = 1;
        System.out.println("Count of "+target+" is "+count(arr,target));
    }
}
