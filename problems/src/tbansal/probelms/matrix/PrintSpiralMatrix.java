package tbansal.probelms.matrix;

public class PrintSpiralMatrix {

	public static void main(String[] args) {

		int n = 6;
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (j + 1) + (i * n);
				if (matrix[i][j] < 10) {
					System.out.print(matrix[i][j] + "  ");
				} else {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();

		}

		printMatrix(matrix);

		// 2nd test case
		System.out.println();
		System.out
				.println("-------------------------------2nd test case------------------------");
		System.out.println();

		n = 7;
		index=0;
		matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (j + 1) + (i * n);
				if (matrix[i][j] < 10) {
					System.out.print(matrix[i][j] + "  ");
				} else {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();

		}

		printMatrix(matrix);

	}

	private static void printMatrix(int[][] matrix) {
		int n = 0;
		while (index < matrix.length * matrix.length) {
			printTop(n, matrix);
			printRight(n, matrix);
			printBottom(n, matrix);
			printleft(n, matrix);
			n++;

		}
	}

	static int index = 0;

	private static void printTop(int n, int[][] matrix) {

		int i = n;
		int j = n;
		while (j < matrix.length - n && index < matrix.length * matrix.length) {
			System.out.print(matrix[i][j] + " ");
			j++;
			index++;
		}

	}

	private static void printRight(int n, int[][] matrix) {
		int i = n + 1;
		int j = matrix.length - 1 - n;
		while (i < matrix.length - n && index < matrix.length * matrix.length) {
			System.out.print(matrix[i][j] + " ");
			i++;
			index++;
		}

	}

	private static void printBottom(int n, int[][] matrix) {
		int i = matrix.length - 1 - n;
		int j = matrix.length - n - 2;
		while (j >= n && index < matrix.length * matrix.length) {
			System.out.print(matrix[i][j] + " ");
			j--;
			index++;
		}

	}

	private static void printleft(int n, int[][] matrix) {
		int i = matrix.length - 2 - n;
		int j = n;
		while (i > n && index < matrix.length * matrix.length) {
			System.out.print(matrix[i][j] + " ");
			i--;
			index++;
		}

	}
}
