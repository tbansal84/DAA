package programs;

import helper.BinaryTreeHelper;
import helper.BinaryTreeNode;

public class MirrorBinaryTree {

	public static void main(String[] args) {
		System.out.println("hello");
		BinaryTreeNode<String> node=BinaryTreeHelper.createTree();
		BinaryTreeHelper.printTree(node);
		mirror(node);
		BinaryTreeHelper
				.printTree(node);

	}

	private static void mirror(BinaryTreeNode node) {
		if (node.hasLeft())
			mirror(node.getLeft());
		if (node.hasright())
			mirror(node.getRight());
		if (!node.isLeaf()) {
			swapChildren(node);
		}

	}

	private static void swapChildren(BinaryTreeNode<String> node) {

		BinaryTreeNode<String> temp = node.getLeft();
		node.setLeft(node.getRight());
		node.setRight(temp);

	}

}
