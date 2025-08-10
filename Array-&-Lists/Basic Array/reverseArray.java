//Without 2nd array
import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args){
        int array[] = {1,2,3,4,5,6};
        int temp;
		System.out.println("Before: "+Arrays.toString(array));
        for(int i = 0; i<array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("After: "+Arrays.toString(array));
	}
}
