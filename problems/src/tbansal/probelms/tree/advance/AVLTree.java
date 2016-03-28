package tbansal.probelms.tree.advance;

public class AVLTree {

	public static void main(String[] args) {

		Node n;

	}

	private static Node insert(Node node, int value) {
		if (node == null) {
			return (new Node(value));
		}

		if (value < node.value) {
			node.left = insert(node.left, value);

		} else if (value > node.value) {
			node.right = insert(node.right, value);
		}

		node.height = Math.max(node.right.height, node.left.height) + 1;
		int isbalance = node.left.height - node.right.height;

		boolean leftleft = isbalance > 1 && node.left.value > value;
		boolean leftright = isbalance > 1 && node.left.value < value;
		boolean rightright = isbalance < 1 && node.right.value < value;
		boolean rightleft = isbalance < 1 && node.right.value > value;
		if (leftleft) {
			node = rightRotate(node);
		}

		if (rightright) {
			node = leftRotate(node);
		}

		if (leftright) {
			node.left = leftRotate(node.left);
			node = rightRotate(node);
		}

		if (rightleft) {
			node.right = rightRotate(node.right);
			node = leftRotate(node);
		}
		return node;
	}

	private static Node delete(Node node, int value) {
		if (node == null) {
			return (new Node(value));
		}

		if (value < node.value) {
			node.left = delete(node.left, value);

		} else if (value > node.value) {
			node.right = delete(node.right, value);
		} else {
			// delete
			if (node.left == null && node.right == null) {
				node = null;

			} else if (node.left == null) {
				node = node.right;

			} else if (node.right == null) {
				node = node.left;

			} else {
				Node t = node.right;
				while (t.left != null) {
					t = t.left;
				}
				node.value = t.value;
				delete(node.right, t.value);

			}
		}

		node.height = Math.max(node.right.height, node.left.height) + 1;
		int isbalance = node.left.height - node.right.height;

		boolean leftleft = isbalance > 1
				&& (node.left.left.height - node.right.right.height) >= 0;
		boolean leftright = isbalance > 1
				&& (node.left.left.height - node.right.right.height) < 0;
		boolean rightright = isbalance < 1
				&& (node.right.left.height - node.right.right.height) < 0;
		boolean rightleft = isbalance < 1
				&& (node.right.left.height - node.right.right.height) >= 0;
		if (leftleft) {
			node = rightRotate(node);
		}

		if (rightright) {
			node = leftRotate(node);
		}

		if (leftright) {
			node.left = leftRotate(node.left);
			node = rightRotate(node);
		}

		if (rightleft) {
			node.right = rightRotate(node.right);
			node = leftRotate(node);
		}
		return node;
	}

	/**
	 * 
	 * current node will become the left child of its right child. and left
	 * child of right will become right child of current.
	 * 
	 * 
	 * calculate height of rotated node then new parent
	 * 
	 * @param n
	 * @return
	 */
	private static Node leftRotate(Node n) {
		Node tobeParent = n.right;
		Node toberightchild = tobeParent.left;

		tobeParent.left = n;
		n.right = toberightchild;
		n.height = Math.max(n.left.height, n.right.height) + 1;
		tobeParent.height = Math.max(tobeParent.left.height,
				tobeParent.right.height) + 1;
		return tobeParent;
	}

	/**
	 * 
	 * current node will become the right child of its left child. and right
	 * child of left will become left child of current.
	 * 
	 * 
	 * calculate height of rotated node then new parent
	 * 
	 * @param n
	 * @return
	 */
	private static Node rightRotate(Node n) {
		Node tobeParent = n.left;
		Node tobeleftchild = tobeParent.right;

		tobeParent.right = n;
		n.left = tobeleftchild;
		n.height = Math.max(n.left.height, n.right.height) + 1;
		tobeParent.height = Math.max(tobeParent.left.height,
				tobeParent.right.height) + 1;
		return tobeParent;
	}
	
	static class Node {
		public int value;
		public Node left;
		public Node right;
		public int height;

		public Node(int value) {
			super();
			this.value = value;
		}

	}

}


