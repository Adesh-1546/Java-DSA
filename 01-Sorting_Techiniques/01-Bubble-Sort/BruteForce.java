package sorting1;

import java.util.Arrays;

public class Bubble_Sort {
	
	public static void bubbleSort(int arr[]) {
		
		for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = 0; j < arr.length - i - 1; j++) { 
	            
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j]; 
	                arr[j] = arr[j + 1]; 
	                arr[j + 1] = temp; 
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		int arr[] = { 5, 3, 8, 4, 2 };
		System.out.println("Before sorting : "+ Arrays.toString(arr));
		
		bubbleSort(arr);
		System.out.println("After sorting : "+ Arrays.toString(arr));
	}

}
