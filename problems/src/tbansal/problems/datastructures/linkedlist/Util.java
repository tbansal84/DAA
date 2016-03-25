package tbansal.problems.datastructures.linkedlist;

public class Util {

	public static LinkedNode getLinkedList() {
		return new LinkedNode(1, new LinkedNode(2, new LinkedNode(3,
				new LinkedNode(4, new LinkedNode(5, new LinkedNode(6,
						new LinkedNode(7, new LinkedNode(8, new LinkedNode(9,
								new LinkedNode(10, new LinkedNode(11, new LinkedNode(12, null))))))))))));
	}
}
