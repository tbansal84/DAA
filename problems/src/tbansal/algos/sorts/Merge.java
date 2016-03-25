package tbansal.algos.sorts;

public class Merge {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 8, 2, 3, 6, 7, 9, 4 };
		mergesort(arr, 0, arr.length - 1);

	}

	static int[] temp = { 1, 5, 8, 2, 3, 6, 7, 9, 4 };

	private static void mergesort(int[] arr, int left, int right) {
		int mid = (left + right) / 2;
		mergesort(arr, left, mid);
		mergesort(arr, mid + 1, right);
		merge(arr, left, mid, right);

	}

	private static void merge(int[] arr, int left, int mid, int right) {

		int i = 0;
		int j = mid + 1;
		while (i < mid) {
			if (arr[i] < arr[j]) {
				i++;
				temp[i] = arr[i];
			} else {
				j++;
				temp[i] = arr[j];
			}
		}

	}
}
