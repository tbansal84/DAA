package tbansal.probelms.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Solutions2 {

	public static void main(String[] args) {
		System.out.println(find(new int[] { 4, 1, 0, 1, 1, 0, 1 }));
	}

	private static int find(int arr[]) {
		int sum[] = new int[arr.length + 1];
		int i = 1;
		for (Integer a : arr) {
			sum[i] = sum[i - 1] + a;
			i++;
		}

		return findSum(sum, 1, sum.length - 1);

	}
	
	private static int[] findSum(int arr, )

	private static int findSum(int arr[], int start, int end) {
		if (arr.length == 1) {
			return 0;
		}
		int sum = arr[end];
		int index = Arrays.binarySearch(arr, start, end, sum / 2);
		if (index > 0) {
			return Math.max(findSum(arr, start, index) + 1, findSum(arr, index + 1, end) + 1);
		} else {
			return 0;
		}

	}

}
