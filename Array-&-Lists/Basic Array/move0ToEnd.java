import java.util.Arrays;

public class move0ToEnd {
    public static void main (String args[]){
        int arr[] = {1,2,0,4,0,5};
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[pos] = arr[i];
                pos++;
            }
        }
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
        System.out.println(Arrays.toString(arr));
    }
}