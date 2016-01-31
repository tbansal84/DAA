package tbansal.practice.tree;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;

import tbansal.practice.tree.util.BinaryTreeNode;

public class BinaryTree {

	static int i = 0;

	public static void main(String[] args) {
		inOrderTraversal(createTree(), false, false);
		System.out.println(i);
		i = 0;
		inOrderTraversalStack(createTree());
		preOrderTraversal(createTree());
		System.out.println(i);
		// i = 0;
		preOrderTraversalStack(createTree());
		postOrderTraversal(createTree());
		System.out.println(i);
		i = 0;
		postOrderTraversalStack(createTree());
		i = 0;
		leftView(createTree(), 1, new AtomicReference<Integer>());
		System.out.println();
		// rightView(createTree(),1,new AtomicReference<Integer>(0));

	}

	private static void leftView(BinaryTreeNode n, int level,
			AtomicReference<Integer> ref) {

		if (n != null) {
			i++;
			if (level > ref.get()) {
				// System.out.print(level+"--"+ref.get()+"--");
				ref.set(level);
				n.visited();
			}
			leftView(n.getLeft(), level + 1, ref);

			leftView(n.getRight(), level + 1, ref);

		}

	}

	private static void rightView(BinaryTreeNode n, int level,
			AtomicReference<Integer> ref) {

		if (n != null) {
			i++;
			if (level > ref.get()) {
				// System.out.print(level+"--"+ref.get()+"--");
				ref.set(level);
				n.visited();
			}
			rightView(n.getRight(), level + 1, ref);
			rightView(n.getLeft(), level + 1, ref);

		}

	}

	private static void inOrderTraversalStack(BinaryTreeNode n) {
		if (n != null) {
			int i = 0;
			Stack<BinaryTreeNode> nodes = new Stack<BinaryTreeNode>();
			nodes.push(n);
			while (!nodes.isEmpty()) {
				n = nodes.pop();
				if (n.hasLeft() && !n.getLeft().isVisited()) {
					nodes.push(n);
					nodes.push(n.getLeft());
				} else {
					n.visited();
					if (n.hasright() && !n.getRight().isVisited()) {
						nodes.push(n.getRight());
					}
				}
				i++;
				try {
					Thread.sleep(0000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}

	}

	private static void preOrderTraversalStack(BinaryTreeNode n) {
		if (n != null) {
			int i = 0;
			Stack<BinaryTreeNode> nodes = new Stack<BinaryTreeNode>();
			nodes.push(n);
			while (!nodes.isEmpty()) {
				n = nodes.pop();
				if (n.hasLeft() && !n.getLeft().isVisited()) {
					n.visited();
					nodes.push(n);
					nodes.push(n.getLeft());
				} else {
					if (!n.isVisited())
						n.visited();
					if (n.hasright() && !n.getRight().isVisited()) {
						nodes.push(n.getRight());
					}
				}
				try {
					Thread.sleep(0000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
			System.out.println(i);
		}
	}

	private static void postOrderTraversalStack(BinaryTreeNode n) {
		if (n != null) {

			Stack<BinaryTreeNode> nodes = new Stack<BinaryTreeNode>();
			nodes.push(n);
			int i = 0;
			while (!nodes.isEmpty()) {
				i++;
				n = nodes.pop();
				if (n.hasLeft() && !n.getLeft().isVisited()) {
					nodes.push(n);
					nodes.push(n.getLeft());
				} else {
					if (n.hasright() && !n.getRight().isVisited()) {
						nodes.push(n);
						nodes.push(n.getRight());
					} else {
						n.visited();
					}
				}
				try {
					Thread.sleep(0000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println(i);
		}
	}

	private static void inOrderTraversal(BinaryTreeNode n, boolean b,
			boolean left) {
		if (n != null) {
			i++;
			inOrderTraversal(n.getLeft(), b, true);
			if (b && !n.hasLeft() && left)
				n.visited();
			else if (!b) {
				n.visited();

			}
			inOrderTraversal(n.getLeft(), b, false);

		}
	}

	private static void preOrderTraversal(BinaryTreeNode n) {
		if (n != null) {
			i++;
			n.visited();
			preOrderTraversal(n.getLeft());
			preOrderTraversal(n.getRight());

		}

	}

	private static void postOrderTraversal(BinaryTreeNode n) {
		if (n != null) {
			i++;
			postOrderTraversal(n.getLeft());

			postOrderTraversal(n.getRight());
			n.visited();

		}

	}

	private static BinaryTreeNode createTree() {

		return new BinaryTreeNode(new BinaryTreeNode(new BinaryTreeNode(3),
				new BinaryTreeNode(new BinaryTreeNode(new BinaryTreeNode(null,
						new BinaryTreeNode(7), 6), null, 10),
						new BinaryTreeNode(13), 12), 5), new BinaryTreeNode(
				null, new BinaryTreeNode(new BinaryTreeNode(18),
						new BinaryTreeNode(23), 20), 16), 15);

	}

}
