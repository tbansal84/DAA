package tbansal.problems.dynamicprogramming;

import java.util.Arrays;
import java.util.Comparator;

public class DiagnolSumm {

	public static void main(String[] args) {

//		String[] input = { "137", "364", "115", "724" };

		int m = input.length;
		int n = input[0].length();
		Integer[][] arr = new Integer[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = input[i].charAt(j) - '0';
			}
		}
		for (int i = 0; i < m; i++) {
			Arrays.sort(arr[i]);
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			int max = 0;
			for (int j = 0; j < m; j++) {
				if (max < arr[j][i]) {
					max = arr[j][i];
				}
			}
			sum = sum + max;
		}


	}
}
