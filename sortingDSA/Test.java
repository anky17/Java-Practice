package sortingDSA;

public class Test {

	public static void main(String[] args) {

		BubbleSort sort = new BubbleSort();

		int[] array = { 3, 47, 7, 6, 78, 8, 5, 40 };
		sort.bubbleSort(array);

		System.out.println("Sorted Array is: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
