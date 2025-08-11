//Finding missing value from sorted array 
public class missingArrayNumber {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,7};
        int expected_sum = array[array.length-1]*(array[array.length-1]+1)/2;
        int actual_sum = 0;
        for (int i = 0; i < array.length; i++) {
            actual_sum += array[i]; 
        }
        int missing_value = expected_sum - actual_sum;
        if(missing_value==0)
            System.out.println("All good");
        else
            System.out.println("Missing Value : "+missing_value);
    }
}
