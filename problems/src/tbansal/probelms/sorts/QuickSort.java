package tbansal.probelms.sorts;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 2, 4, 11, 6, 15, 3, 1, 5, 10 };
		int[] temp = new int[] { 7, 2, 4, 11, 6, 15, 3, 1, 5, 10 };
		sort(arr, 0, arr.length - 1);
		print(arr);

	}

	private static void sort(int[] arr, int left, int right) {

		int pivotindx = right;
		int comparisonidx = left;
		while (true) {
			if (arr[pivotindx] > arr[comparisonidx]) {
				left++;
			} else {
				swap(arr, pivotindx, comparisonidx);
				pivotindx = comparisonidx;
				comparisonidx = right;
			}
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int swap = arr[j];
		arr[j] = arr[i];
		arr[i] = swap;

	}

	private static void print(int[] arr) {
		for (int a : arr) {
			System.out.print(a + ",");
		}
		System.out.println("");
	}

}
