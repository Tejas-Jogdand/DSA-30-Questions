public class twoSum {

	static void brutForce(int arr[], int targetSum){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(targetSum==arr[i]+arr[j]){
					System.out.println("("+arr[i]+","+arr[j]+")");
					break;
				}
			}
		}
	}

	static void twoPointer(int arr[], int targetSum){
		
	}

	public static void main(String[] args){
		// int arr[] = {2,3,4,12,1};
		int arr[] = {1,2,3,4,5};
		int targetSum = 5;
		brutForce(arr, targetSum);
		
	}
}
