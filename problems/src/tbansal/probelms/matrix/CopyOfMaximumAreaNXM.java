package tbansal.probelms.matrix;

/**
 * create auxillary matrix
 * 
 * @author tarunbansal
 * 
 */
public class CopyOfMaximumAreaNXM {

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

		char mat3[][] = { 
				{ 'X', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'X', 'O', 'X', 'X', 'X', 'X', 'O' },
				{ 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'O' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'O' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'O' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'O' } };

		System.out.println(findlargestIsland(mat3));

	}

	private static int findlargestIsland(char mat[][]) {
		int aux[][] = new int[mat.length][mat.length];
		for (int i = 0; i < mat.length; i++) {
			aux[0][i] = mat[0][i] == 'X' ? 1 : 0;
			aux[i][0] = mat[i][0] == 'X' ? 1 : 0;
		}
		int size = 0;
		for (int i = 1; i < aux.length; i++) {
			for (int j = 1; j < aux.length; j++) {

				int left = aux[i - 1][j];
				int top = aux[i][j - 1];
				int dia = aux[i - 1][j - 1];
				int value = 0;
				// value is minimu of left top and diagnol if mat[i][j]='X' else
				// 0;
				if (mat[i][j] == 'X') {
					value = Math.min(Math.min(left, top), dia) + 1;
				}
				aux[i][j] = value;
				if (size < aux[i][j]) {
					size = aux[i][j];
				}

			}

		}
		return size;

	}
}
