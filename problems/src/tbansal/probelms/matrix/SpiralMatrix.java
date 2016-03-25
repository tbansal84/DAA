package tbansal.probelms.matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		int n = 6;
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (j + 1) + (i * n);
				if (matrix[i][j] < 10) {
					System.out.print(matrix[i][j] + "  ");
				}
				else{
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();

		}

		printSpiral(matrix);
	}

	private static void printSpiral(int[][] matrix) {
		int length = matrix.length;
		int size = length * length;
		int i = 0;
		int j = 0;
		boolean printintop = true;
		boolean printginright = false;
		boolean printingbottom = false;
		boolean printingleft = false;
		int itr = length;
		while (size >= 1) {

			System.out.print(matrix[i][j] + " ");

			if (printintop) {
				j++;

			}
			if (printginright) {
				i++;

			}
			if (printingbottom) {
				j--;
			}
			if (printingleft) {
				i--;
			}

			if (printintop && j == itr - 1) {
				printintop = false;
				printginright = true;
			}
			if (printginright && i == itr - 1) {
				printginright = false;
				printingbottom = true;
			}
			if (printingbottom && j == length - itr) {
				printingbottom = false;
				printingleft = true;

			}
			if (printingleft && i == length - itr + 1) {
				System.out.print(matrix[i][j] + " ");
				size--;
				printintop = true;
				printingleft = false;
				itr--;
				j++;
			}
			size--;

		}

	}
}
