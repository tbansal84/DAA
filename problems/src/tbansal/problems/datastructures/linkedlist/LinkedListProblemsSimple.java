package tbansal.problems.datastructures.linkedlist;

public class LinkedListProblemsSimple {

	public static void main(String[] args) {
		LinkedNode n = Util.getLinkedList();
		Util.printLinkedList(n);
		LinkedNode a=reverser(n);
		Util.printLinkedList(a);
	}

	private static LinkedNode reverse(LinkedNode n) {
		LinkedNode result = null;
		LinkedNode current = n;
		LinkedNode next = null;

		while (current != null) {
			next = current.next;
			current.next = result;
			result = current;
			current = next;

		}
		return result;

	}

	private static LinkedNode reverser(LinkedNode n) {
		if (n == null) {
			return null;
		}
		if (n.next == null) {
			n.next=n;
			return n;
		}
		LinkedNode temp=n.next;
		n.next=null;
		LinkedNode lastNode=reverser(temp);
		temp.next=n;
		return lastNode;

	}

	private static LinkedNode insertAtBegin(LinkedNode n) {
		return new LinkedNode(0, n);

	}

	private static LinkedNode delete(LinkedNode n, int node) {
		LinkedNode head = n;
		if (n.value == node) {
			return n.next;
		}
		while (n != null && n.next != null) {
			LinkedNode temp = n.next;
			if (temp.value == node) {
				n.next = temp.next;
				break;
			}
			n = temp;

		}

		return head;

	}

}
