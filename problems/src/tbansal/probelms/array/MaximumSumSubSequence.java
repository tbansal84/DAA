package tbansal.probelms.array;

/**
 * 
 * the programs uses Kadane'e algorithm to find subsequence in array with max
 * sum
 * 
 * @author tarunbansal
 * 
 */
public class MaximumSumSubSequence {

	public static void main(String[] args) {
		System.out.println(findMaximumSum(new int[] { -2, -3, 4, -1, -2, 1, 5,
				-3 }));
		System.out.println(findMaximumSumPrintIndexes(new int[] { -2, -3, 4, -1, -2,
				1, 5, -3 }));
	}

	private static int findMaximumSum(int arr[]) {
		int sum = 0;
		int max = 0;

		for (int i : arr) {
			sum = sum + i;
			if (sum < 0) {
				sum = 0;
			}
			if (sum > max) {
				max = sum;
			}

		}

		return max;
	}

	/**
	 * return sum and print start and begin index of subsequence
	 * 
	 * @param arr
	 * @return
	 */
	private static int findMaximumSumPrintIndexes(int arr[]) {
		int sum = 0;
		int max = 0;
		int start = 0;
		int end = 0;
		int ind = 0;
		for (int i : arr) {
			sum = sum + i;
			if (sum < 0) {
				start = ind + 1;
				sum = 0;
			}
			if (sum > max) {
				max = sum;
				end = ind;
			}
			ind++;
		}

		System.out.println(start);
		System.out.println(end);

		return max;
	}

}
