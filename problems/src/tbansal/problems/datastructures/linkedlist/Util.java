package tbansal.problems.datastructures.linkedlist;

public class Util {

	public static LinkedNode getLinkedList() {
		return new LinkedNode(1, new LinkedNode(2, new LinkedNode(3,
				new LinkedNode(4, new LinkedNode(5, new LinkedNode(6,
						new LinkedNode(7, new LinkedNode(8, new LinkedNode(9,
								new LinkedNode(10, new LinkedNode(11,
										new LinkedNode(12, new LinkedNode(13,
												null)))))))))))));
	}

	public static LinkedNode getLoopLinkedList() {

		LinkedNode last = new LinkedNode(13, null);

		LinkedNode n = new LinkedNode(5, new LinkedNode(6, new LinkedNode(7,
				new LinkedNode(8, new LinkedNode(9, new LinkedNode(10,
						new LinkedNode(11, new LinkedNode(12, last))))))));

		last.next = n;

		return new LinkedNode(1, new LinkedNode(2, new LinkedNode(3,
				new LinkedNode(4, n))));
	}

	public static void printLinkedList(LinkedNode node) {
		while (node != null) {
			System.out.print(node.value+" ");
			node = node.next;
		}
		System.out.println();

	}
}
