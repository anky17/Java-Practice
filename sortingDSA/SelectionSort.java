package sortingDSA;

public class SelectionSort {

	public static void Selectionsorting(int[] arr) {

		int i, j;
		int n = arr.length;

		for (i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (j = i; j < n - 1; j++) {
				if (arr[j] < arr[minIndex]) {

					minIndex = j;

				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 48, 2, 1, 9, 8, 34, 67, 23 };

		System.out.println("Array before sorting: ");
		printArray(arr);

		Selectionsorting(arr);
		System.out.println("Array after sorting: ");
		printArray(arr);
	}
}
