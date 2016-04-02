package tbansal.problems.dynamicprogramming;

public class NQueen {

	public static void main(String[] args) {

	}

	private static boolean issafe(int[][] arr) {
		return true;
	}

	private static boolean solve(int arr[][], int column) {
		if (column >=arr.length) {
			return true;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i][column] = 1;
			if (solve(arr, column + 1)) {
				return true;
			}
			arr[i][column] = 0;

		}
		return false;
	}
}
