package tbansal.probelms.tree.advance;

import java.awt.Color;

public class RedBlackTree {

	public enum Colors {
		RED, BLACK;
	}

	private static Node insert(Node n, int value) {
		if (n == null) {
			Node node = new Node(value);
			node.color = Colors.RED;
			return node;
		}
		Node node = null;
		if (value > n.value) {
			node.left = insert(n.left, value);
			node.parent = n;
		} else if (value < n.value) {
			node.right = insert(n.left, value);
			node.parent = n;

		}

		rebalance(value < n.value, node);

		return node;

	}

	/**
	 * @param n
	 *            parent of inserted node
	 * @return
	 */
	private static Node rebalance(boolean left, Node node) {
		if (node == null || node.parent == null) {
			// node is root
		}
		if (isRed(node.parent)) {

			Node uncle = uncle(node);
			if (isRed(uncle)) {
				uncle.color = Colors.BLACK;
				node.parent.color = Colors.BLACK;
				if (!isRoot(node.parent.parent)) {
					rebalance(left, node.parent);

				}
			} else {
				rotate(node);
			}

		}
		return node;

	}

	private static Node uncle(Node node) {
		// TODO: is grapdpa root? will fail
		return node.parent.parent.right;

	}

	private static boolean isRoot(Node n) {
		return n.parent == null;
	}

	private static boolean isRed(Node n) {
		return n.color.equals(Colors.RED);
	}

	private static boolean isBlack(Node n) {
		return n.color.equals(Colors.RED);
	}

	private static Node rotate(Node n) {
		return n;

	}

	private static void getBalance(Node n) {

	}

	static class Node {

		public int value;
		public Node left;
		public Node right;
		public Colors color;
		public Node parent;

		public Node(int value) {
			super();
			this.value = value;
		}

	}

}
