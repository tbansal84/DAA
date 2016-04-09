package tbansal.problems.util;

public class ArraysUtil {

	/**
	 * print comma spearated values supplied in array
	 * 
	 * @param array
	 */
	public static void printArrays(Object[] array) {
		for (Object element : array) {
			System.out.println(element + ",");
		}
	}
	
	public static void printArrays(int[] array) {
		for (int element : array) {
			System.out.println(element + ",");
		}
	}

	public static void printBinaryForm(Integer i) {
		System.out.println(i.toBinaryString(i));
	}

	public static void printMatrix(int[][] arr, int m, int n) {
//		for (int j = 0; j < n; j++) {
//
//			System.out.print(padBlanks(j));
//
//		}
//		System.out.println();
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

//				if (j == 0) {
//					System.out.print(i + " ");
//				}
				System.out.print(padBlanks(arr[i][j]));
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(boolean[][] arr, int m, int n) {
//		for (int j = 0; j < n; j++) {
//
//			System.out.print(padBlanks(j));
//
//		}
//		System.out.println();
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

//				if (j == 0) {
//					System.out.print(i + " ");
//				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	private static String padBlanks(int i) {

		String s = Integer.toString(i);
		int length = s.length();
		int padlength = 5 - s.length();
		while (padlength > 0) {
			s = " ".concat(s);
			padlength--;
		}

		return s + " ";

	}

}
