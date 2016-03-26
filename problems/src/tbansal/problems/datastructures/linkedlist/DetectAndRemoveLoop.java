package tbansal.problems.datastructures.linkedlist;

import static tbansal.problems.datastructures.linkedlist.Util.*;

public class DetectAndRemoveLoop {

	public static void main(String[] args) {
		LinkedNode n = getLoopLinkedList();

		detectLoop(n);
	}

	private static void detectLoop(LinkedNode n) {

		LinkedNode slow = n;
		LinkedNode fast = n;

		while (slow.equals(n) || slow != fast) {
			if (fast.next == null || fast.next.next == null) {
				break;
			}

			slow = slow.next;
			fast = fast.next.next;

		}

		slow = n;

		while (true) {
			slow = slow.next;
			if (slow.value == fast.next.value) {
				break;
			}
			fast = fast.next;
		}

		System.out.println(slow.value);
		// printLinkedList(n); don't un-comment to avoid circular printing
		fast.next = null;
		printLinkedList(n);

	}
}
