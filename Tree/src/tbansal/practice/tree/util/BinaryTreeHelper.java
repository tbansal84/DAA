package tbansal.practice.tree.util;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class BinaryTreeHelper {

	public static BinaryTreeNode createTreeAlphabets() {

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
	
	public static void levelOrderView(BinaryTreeNode<String> node) {
		Queue<BinaryTreeNode<String>> queue = new ArrayBlockingQueue<BinaryTreeNode<String>>(
				200);
		queue.add(node);
		while (!queue.isEmpty()) {
			BinaryTreeNode<String> item = queue.poll();
			System.out.print(item.getValue() + ",");
			if (item.hasLeft())
				queue.add(item.getLeft());
			if (item.hasright())
				queue.add(item.getRight());

		}

	}
	
	public static BinaryTreeNode createTreeNumber() {

		return new BinaryTreeNode(
				new BinaryTreeNode(new BinaryTreeNode(3),
						new BinaryTreeNode(
								new BinaryTreeNode(new BinaryTreeNode(null, new BinaryTreeNode(7), 6), null, 10),
								new BinaryTreeNode(13), 12),
						5),
				new BinaryTreeNode(null, new BinaryTreeNode(new BinaryTreeNode(18), new BinaryTreeNode(23), 20), 16),
				15);

	}

}
