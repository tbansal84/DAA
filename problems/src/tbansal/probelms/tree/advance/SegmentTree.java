package tbansal.probelms.tree.advance;

/**
 * 
 * Segment tree is useful to calculate sum of a given range in form of array
 * indices.
 * 
 * https://www.youtube.com/watch?v=xuoQdt5pHj0
 * http://www.geeksforgeeks.org/segment-tree-set-1-sum-of-given-range/
 * 
 * @author tarunbansal
 * 
 */
public class SegmentTree {

	private static void createSegmentTree(int[] arr) {

		int inputSize = arr.length;
		// size of segment tree for array length=n
		// is 2*(2 pow logn)-1
		int segmentTreeSize = 2 * (int) (Math.pow(2, Math.log(inputSize))) - 1;

		int[] tree = new int[segmentTreeSize];
		createTree(arr, 0, segmentTreeSize - 1, 0, tree);

	}

	/**
	 * function to used recursively to create segment tree
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @param treeIndex
	 * @param tree
	 * @return
	 */
	private static int createTree(int arr[], int low, int high, int treeIndex,
			int[] tree) {

		int value = 0;
		if (low == high) {
			value = arr[low];
			tree[treeIndex] = value;
			return value;
		}
		int mid = low + high / 2;
		value = createTree(arr, low, mid, 2 * treeIndex + 2, tree)
				+ createTree(arr, mid, high, 2 * treeIndex + 2, tree);
		tree[treeIndex] = value;
		return value;

	}

	private static int getSum(int[] tree, int searchRangeLow,
			int searchRangeHigh, int currentRangeLow, int currentRangeHigh,
			int index) {
		if (currentRangeLow > searchRangeLow
				&& currentRangeHigh < searchRangeHigh) {
			return tree[index];
		}

		if (currentRangeHigh < searchRangeLow
				|| currentRangeLow > searchRangeHigh) {
			return 0;
		}

		int mid = (currentRangeHigh + currentRangeLow) / 2;

		return getSum(tree, searchRangeLow, searchRangeHigh, currentRangeLow,
				mid, 2 * index + 1)
				+ getSum(tree, searchRangeLow, searchRangeHigh, mid + 1,
						currentRangeHigh, 2 * index + 2);

	}

	/**
	 * @param diff
	 *            difference in previous and new value at index treeIndex
	 * @param treeIndex
	 * @param low
	 * @param high
	 * @param tree
	 */
	private static void updateTree(int diff, int treeIndex, int low, int high,
			int[] tree) {

		if (treeIndex < low || treeIndex > high) {// check index is not in range
			return;
		}
		tree[treeIndex] = tree[treeIndex] + diff;
		if (low != high) {// check if range is single element
			int mid = low + high / 2;
			updateTree(diff, 2 * treeIndex + 1, low, mid, tree);
			updateTree(diff, 2 * treeIndex + 2, mid + 1, high, tree);
		}

	}
}
