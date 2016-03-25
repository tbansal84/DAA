package tbansal.probelms.array;

public class InvertZero {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 };
		findZeroIndex(arr, arr.length);
		System.out.println(arr.length);

	}

	private static void findZeroIndex(int[] arr, int length) {

		boolean start = false;
		boolean doend = false;
		int max = 0;
		int size = 0;
		int zero = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] == 1) {
				if (!start) {
					start = true;
					size++;
				} else {
					size++;
				}
			} else if (arr[i] == 0 && doend) {
				if (max < size) {
					max = size;
					zero = i;
				}

				start = false;
			} else if (arr[i] == 0 && !doend) {
				if (i + 2 < length && arr[i + 1] == 1) {
					size++;
					doend = true;
				} else {
					size = 0;
					start = false;

				}

			}

		}
		System.out.println(zero);

	}

}
