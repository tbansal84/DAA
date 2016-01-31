package helper;

public class BinaryTreeHelper {

	public static BinaryTreeNode createTree() {

		return new BinaryTreeNode<String>(new BinaryTreeNode<String>(
				new BinaryTreeNode<String>(new BinaryTreeNode<String>("H"),
						new BinaryTreeNode<String>("I"), "D"),
				new BinaryTreeNode<String>(new BinaryTreeNode<String>("J"),
						new BinaryTreeNode<String>("K"), "E"), "B"),
				new BinaryTreeNode<String>(new BinaryTreeNode<String>(
						new BinaryTreeNode<String>("L"),
						new BinaryTreeNode<String>("M"), "F"),
						new BinaryTreeNode<String>(new BinaryTreeNode<String>(
								"N"), new BinaryTreeNode<String>("O"), "G"),
						"C"), "A");

	}
	
	public static <T extends Comparable<T>> void printTree(
			BinaryTreeNode<T> node) {
		printTreePreOrder(node);
		System.out.println("\n");
		
	}

	public static <T extends Comparable<T>> void printTreePreOrder(
			BinaryTreeNode<T> node) {
		System.out.print(node.getValue() + ",");
		if (node.hasLeft())
			printTreePreOrder(node.left);
		if (node.hasright())
			printTreePreOrder(node.right);
	}

}
