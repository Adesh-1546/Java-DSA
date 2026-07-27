package sorting1;

import java.util.Arrays;

public class Selection_Sort {

	public static int[] selectionSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i; 								// asume that current index holds minimum

			for (int j = i + 1; j < arr.length; j++) { 		// find minimum element in remaining array

				if (arr[smallest] > arr[j]) {
					smallest = j; 							// update smallest if more smaller found
				}
			}

			// swap
			int temp = arr[smallest]; 			// swap the found minimum element with the first element of unsorted part
			arr[smallest] = arr[i];
			arr[i] = temp;

		}
		return arr; 
	}

	public static void main(String[] args) {
		int arr[] = { 13, 46, 24, 52, 20, 9 };
		System.out.println("Before sorting : " + Arrays.toString(arr));

		selectionSort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr));
	}

}
