import java.util.HashMap;
import java.util.Map;

public class twoSum {

	// O(n^2)
	static void brutForce(int arr[], int targetSum){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(targetSum==arr[i]+arr[j]){
					System.out.print("\n("+arr[i]+","+arr[j]+")");
					break;
				}
			}
		}
	}

	// O(n)
	static void twoPointer(int sortedArr[], int targetSum){
		int left = 0;
		int right = sortedArr.length-1;

		for (int i = 0; i < sortedArr.length; i++) {
			if(targetSum == sortedArr[left] + sortedArr[right]){
				System.out.print("\n("+sortedArr[left]+","+sortedArr[right]+")");
				left++;
			}
			right--;
		}
	}

	static void hashmapMethod(int arr[], int targetSum){
		HashMap<Integer, Integer> map = new HashMap<>(); 
		for (int i = 0; i < arr.length; i++) {
			int complement = targetSum - arr[i];
			if(map.containsKey(complement))
				System.out.print("\n("+arr[i]+","+complement+")");
			map.put(arr[i],i);
		}
		// System.out.println(map);
	}

	public static void main(String[] args){
		int arr[] = {2,3,4,12,1};
		// int sortedArr[] = {1,2,3,4,5};
		int targetSum = 5;
		// brutForce(arr, targetSum);
		// // work for sorted array
		// twoPointer(sortedArr, targetSum);
		hashmapMethod(arr, targetSum);
	}
}
