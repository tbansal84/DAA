package tbansal.probelms.matrix;

/**
 * create auxillary matrix
 * 
 * @author tarunbansal
 * 
 */
public class MaximumAreaMXM {

	public static void main(String[] args) {

		// char mat[][] = { { 'O', 'O', 'O' }, { 'X', 'X', 'O' },
		// { 'X', 'X', 'O' }, { 'O', 'O', 'X' }, { 'O', 'O', 'X' },
		// { 'X', 'X', 'O' } };
		//
		// System.out.println(findlargestIsland(mat));

		char mat2[][] = { { 'X', 'O', 'O', 'O', 'O', 'O' },
				{ 'X', 'O', 'X', 'X', 'X', 'X' },
				{ 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'X', 'X', 'X', 'O', 'X', 'X' },
				{ 'X', 'X', 'X', 'O', 'X', 'X' },
				{ 'X', 'X', 'X', 'O', 'X', 'X' }, };

		System.out.println(findlargestIsland(mat2));

		char mat3[][] = { { 'X', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'X', 'O', 'X', 'X', 'X', 'X', 'O' },
				{ 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'O' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'O' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'O' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'O' } };

		System.out.println(findlargestIsland(mat3));

	}

	private static int findlargestIsland(char mat[][]) {
		int auxillary[][] = new int[mat.length][mat.length];
		for (int i = 0; i < mat.length; i++) {
			auxillary[0][i] = mat[0][i] == 'X' ? 1 : 0;
		}
		int size = 0;
		for (int i = 1; i < auxillary.length; i++) {
			for (int j = 0; j < auxillary.length; j++) {

				int top = auxillary[i - 1][j];
				int value = 0;
				// value is minimu of left top and diagnol if mat[i][j]='X' else
				// 0;
				if (mat[i][j] == 'X') {
					value = top + 1;
				}
				auxillary[i][j] = value;

			}

		}
		System.out.println(findLargestinMatrix(auxillary));
		return size;

	}

	private static int findLargestinMatrix(int[][] auxillary) {
		int area = 0;
		for (int i = 0; i < auxillary.length; i++) {
			if (findLargestinRow(auxillary[i]) > area) {
				area = findLargestinRow(auxillary[i]);
			}
		}

		return area;

	}

	private static int findLargestinRow(int[] auxillary) {

		return 0;

	}
}
