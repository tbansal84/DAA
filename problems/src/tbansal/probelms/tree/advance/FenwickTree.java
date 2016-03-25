package tbansal.probelms.tree.advance;

import tbansal.problems.util.ArraysUtil;

/**
 * 
 * Fenwick tree is also known as binary indexed tree. Fenwick tree is useful to
 * answer these type of repeated queries on an array.
 * <p>
 * We have an array arr[0 . .. n-1]. We should be able to
 * 
 * 1 Find the sum of first i elements. 2 Change value of a specified element of
 * the array arr[i] = x where 0 <= i <= n-1.
 * 
 * Fenwick tree has two operations. getSum and update .I prefer to implement the
 * update operation in a FenwickTree before any other.
 * <p>
 * A fenwick tree has no of node+1 nodes and first node is dummy node.
 * 
 * The index of a children in fenwick tree can be calculated by un-setting the
 * rightmost set bit of parent
 * 
 * ref
 * 
 * http://www.geeksforgeeks.org/binary-indexed-tree-or-fenwick-tree-2/
 * https://www.youtube.com/watch?v=CWDQJGaN1gY
 * 
 * @author tarunbansal
 * 
 */
public class FenwickTree {

	private static int[] createTree(int arr[]) {

		int length = arr.length;
		int[] tree = new int[length + 1];

		for (int i = 0; i < length; i++) {
			update(tree, i, arr[i]);
		}
		return tree;

	}

	/**
	 * @param tree
	 *            FenwickTree stored in an array.
	 * @param index
	 *            index of actual array to be updated
	 */
	public static int getSum(int tree[], int index) {

		int sum = 0;
		// the index to be updated in fenwick tree is 1 greater the actual index
		// because of dummy node
		index = index + 1;

		while (index > 0) {

			// index of parent
			sum += tree[index];
			index = getparent(index);

		}
		return sum;

	}

	/**
	 * @param tree
	 *            FenwickTree stored in an array.
	 * @param index
	 *            index of actual array to be updated
	 * @param value
	 *            value to be added in actual array
	 */
	public static void update(int tree[], int index, int value) {

		int sum = 0;
		// the index to be updated in fenwick tree is 1 greater the actual index
		// because of dummy node
		index = index + 1;

		while (index < tree.length) {

			// index of parent
			tree[index] = tree[index] + value;
			index = getNext(index);

		}

	}

	public static void main(String[] args) {
		testgetParent(args);
	}

	public static void testgetParent(String[] args) {
		ArraysUtil.printBinaryForm(9);
		ArraysUtil.printBinaryForm(getparent(9));
		System.out.println(getparent(9));
	}

	/**
	 * 
	 * unset rightmost bit(i-(i&-1))
	 * 
	 * @param i
	 * @return
	 */
	protected static int getparent(int i) {

		return i - (i & get2scomplement(i));

	}

	/**
	 * 
	 * unset rightmost bit(i-(i&-1))
	 * 
	 * @param i
	 * @return
	 */
	protected static int getNext(int i) {

		return i + (i & get2scomplement(i));

	}

	/**
	 * 
	 * unset rightmost bit(i-(i&-1))
	 * 
	 * @param i
	 * @return
	 */
	protected static int get2scomplement(int i) {

		return (-i);

	}

}
