package util;

public class BinaryTreeNode<T extends Comparable> implements
		Comparable<BinaryTreeNode<T>> {
	BinaryTreeNode right;
	BinaryTreeNode left;
	T value;
	boolean visited;

	public boolean isVisited() {
		return visited;
	}

	public void visited() {
		this.visited = true;
		System.out.print(this.getValue() + ",");
	}

	public BinaryTreeNode(BinaryTreeNode right, BinaryTreeNode left, T value) {
		super();
		this.right = left;
		this.left = right;
		this.value = value;
	}

	public BinaryTreeNode(T value) {
		super();
		this.value = value;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasright() {
		return right != null;

	}

	@Override
	public int compareTo(BinaryTreeNode o) {
		return this.value.compareTo(o.getValue());
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public boolean isLeaf() {
		return !this.hasLeft() && !hasright();
	}

}
