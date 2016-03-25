package tbansal.problems.dynamicprogramming;

import java.util.Iterator;

public class NPQueenProblem {
	static int n = 50;

	private static boolean isSafe(int[][] board, int row, int column) {
		// check in previous colums
		for (int i = 0; i < column; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}

		// check diagnol upper
		for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		// check diagnol upper
		for (int i = row, j = column; i < n && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

	private static boolean solve(int[][] board, int j) {

		if (j >= n) {
			return true;
		}
		for (int i = 0; i < n; i++) {
			if (isSafe(board, i, j)) {
				board[i][j] = 1;
				if (solve(board, j + 1)) {
					return true;
				}
				board[i][j] = 0;

			}
		}

		return false;

	}

	public static void main(String arg[]) {
		int board[][] = new int[n][n];
		long time=System.currentTimeMillis();

		if (solve(board, 0) == false) {
			System.out.print("Solution does not exist");
		}

		else {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					System.out.print(board[i][j]);

				}

				System.out.println();

			}
		}
		
		System.out.println(System.currentTimeMillis()-time);

	}

}
