package tbansal.problems.dynamicprogramming;

import tbansal.problems.util.ArraysUtil;

public class Zerooneknapsackagain {

	private static int[][] createGrid(int[] weights, int[] values,
			int totalWeight) {
		int[][] arr = new int[weights.length][totalWeight + 1];
		for (int i = 0; i < weights.length; i++) {
			for (int j = 0; j <= totalWeight; j++) {

				if (weights[i] <= j) {
					arr[i][j] = values[i];
					int remaining = j - weights[i];
					if (i != 0) {
						arr[i][j] = arr[i - 1][remaining] + arr[i][j];
					}
				} else {
					if (i != 0)
						arr[i][j] = arr[i - 1][j];
				}

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int val[] = { 1, 4, 5, 7 };
		int wt[] = { 1, 3, 4, 5 };
		int W = 7;

		int arr[][] = createGrid(wt, val, W);
		ArraysUtil.printMatrix(arr, val.length, W + 1);

	}

}
