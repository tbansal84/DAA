package tbansal.probelms.tree.binary;

import java.util.concurrent.atomic.AtomicInteger;

import tbansal.probelms.tree.binary.util.BinaryTreeHelper;
import tbansal.probelms.tree.binary.util.BinaryTreeNode;

public class LeftAndRightView {

	public static void main(String[] args) {
		BinaryTreeNode<String> node = BinaryTreeHelper.createTreeAlphabets();
		leftView(node,1,new AtomicInteger());
		System.err.println("--");
		rightView(node, 1, new AtomicInteger());

	}

	private static void leftView(BinaryTreeNode<String> node, int level,AtomicInteger maxlevelvisited) {
		if (node != null) {
			if(maxlevelvisited.get()<level){
				maxlevelvisited.set(level);
				System.out.print(node.getValue());
			}
			leftView(node.getLeft(), level + 1,maxlevelvisited);
			leftView(node.getRight(), level + 1,maxlevelvisited);
		}
	}
	private static void rightView(BinaryTreeNode<String> node, int level,AtomicInteger maxlevelvisited) {
		if (node != null) {
			if(maxlevelvisited.get()<level){
				maxlevelvisited.set(level);
				System.out.print(node.getValue());
			}
			rightView(node.getRight(), level + 1,maxlevelvisited);
			rightView(node.getLeft(), level + 1,maxlevelvisited);
			
		}
	}
}
