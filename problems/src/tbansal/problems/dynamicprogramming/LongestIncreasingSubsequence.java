package tbansal.problems.dynamicprogramming;

import tbansal.problems.util.ArraysUtil;

public class LongestIncreasingSubsequence {

	private static void findLongestIncreasingSubsequence(int arr[]) {
		int len = arr.length;
		int i = 0;
		int j = 0;

		int aux[] = new int[len];
		for (int k = 0; k < aux.length; k++) {// minimum length will be one
			aux[k] = 1;
		}

		while (i < len) {
			while (j < i) {
				if (arr[i] < arr[j]) {
					aux[i] = Math.max(aux[j] + 1, aux[i]);

				}
				j++;
			}
			i++;
			j = 0;
		}

		ArraysUtil.printArrays(aux);
	}

	public static void main(String[] args) {
		findLongestIncreasingSubsequence(new int[] { 7, 4, -1, 0, 6, 6, 5, 2, 1, 0, 3 });
	}

}
