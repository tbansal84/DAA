package tbansal.algos.sorts;

public class SelectionSort {

	public static void main(String[] args) {

		sort(new int[] { 7, 2, 4, 6, 3, 1 });

	}

	private static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}

		print(arr);
	}

	private static void print(int[] arr) {
		for (int a : arr) {
			System.out.print(a + ",");
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int swap = arr[j];
		arr[j] = arr[i];
		arr[i] = swap;

	}

}
