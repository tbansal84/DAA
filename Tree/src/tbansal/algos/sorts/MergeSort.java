package tbansal.algos.sorts;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 2, 4,11, 6, 15, 3, 1, 5, 10 };
		int[] temp = new int[] { 7, 2, 4,11, 6, 15, 3, 1, 5, 10 };
		sort(arr, temp, 0, arr.length-1);
		print(arr);

	}

	private static void sort(int[] arr, int[] temp, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;

			sort(arr, temp, left, mid);
			sort(arr, temp, mid + 1, right);
			merge(arr, temp, left, mid + 1, right);

		}

	}

	private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
		System.out.println(left + "," + mid + "," + right);
		int i = 0;
		int j = 0;
		int k = left;
		int lhl = mid - left;
		;
		int rhl = right - mid + 1;
		while (i < lhl && j < rhl) {
			if (arr[i + left] < arr[j + mid]) {
				temp[k] = arr[i + left];
				i = i + 1;
			} else {
				temp[k] = arr[j + mid];
				j = j + 1;
			}
			k = k + 1;
		}

		while (i < lhl) {
			temp[k] = arr[i + left];
			i = i + 1;
			k = k + 1;
		}

		while (j < rhl) {
			temp[k] = arr[j + mid];
			j = j + 1;
			k = k + 1;
		}
		copyArray(arr, temp);
//		print(arr);
	}

	private static void copyArray(int[] arr, int arr2[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr2[i];
		}

	}

	private static void print(int[] arr) {
		for (int a : arr) {
			System.out.print(a + ",");
		}
		System.out.println("");
	}

}
