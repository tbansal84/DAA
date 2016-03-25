package tbansal.problems.datastructures.linkedlist;

public class FindHalf {

	public static void main(String[] args) {

		LinkedNode n = Util.getLinkedList();
		half(n);

	}

	private static void half(LinkedNode node) {
		LinkedNode slow = node;
		LinkedNode fast = node;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

		}

		System.out.println(slow.value);

	}
}
