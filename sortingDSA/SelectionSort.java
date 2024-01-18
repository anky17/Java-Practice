package sortingDSA;

public class SelectionSort {

	// Method to sort the array using selection sort
	public static void Selectionsorting(int[] arr) {

		int i, j;
		int n = arr.length; // function to get array length

		for (i = 0; i < n - 1; i++) {
			// Initially we assume index = i as smallest sorted array element
			int minIndex = i; // it store the index of the array pointing to smallest element. 
			for (j = i; j < n - 1; j++) {
				if (arr[j] < arr[minIndex]) {

					minIndex = j; // update the index element smaller than minIndex element is encountered

				}
			}
			// swap the position of array element in ascending order
			int temp = arr[minIndex]; 
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	// Method to print the array
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // prints the next line
	}

	// Main function to call the user defined functions 
	public static void main(String[] args) {

		int[] arr = { 48, 2, 1, 9, 8, 34, 67, 23 };

		System.out.println("Array before sorting: ");
		printArray(arr);

		Selectionsorting(arr);
		System.out.println("Array after sorting: ");
		printArray(arr);
	}
}
