package tbansal.problems.datastructures.linkedlist;

public class MergeTwoLinkedListinReverseOrder {

	public static void main(String[] args) {
		LinkedNode list1 = new LinkedNode(1, new LinkedNode(2, new LinkedNode(
				5, new LinkedNode(7, new LinkedNode(10, new LinkedNode(12,
						new LinkedNode(18, new LinkedNode(20, new LinkedNode(
								23, new LinkedNode(25, new LinkedNode(27,
										new LinkedNode(30, new LinkedNode(35,
												null)))))))))))));

		LinkedNode list2 = new LinkedNode(8, new LinkedNode(14, new LinkedNode(
				15, new LinkedNode(17, new LinkedNode(19, new LinkedNode(22,
						new LinkedNode(24, new LinkedNode(26, new LinkedNode(
								45, new LinkedNode(48, new LinkedNode(49,
										new LinkedNode(51, new LinkedNode(55,
												null)))))))))))));
		Util.printLinkedList(list1);
		Util.printLinkedList(list2);
		merge(list1, list2);
	}

	private static void merge(LinkedNode list1, LinkedNode list2) {
		LinkedNode newList = null;
		while (list1 != null && list2 != null) {
			if (list1.value < list2.value) {
				LinkedNode next = list1.next;
				list1.next = newList;
				newList = list1;
				list1 = next;

			} else if (list1.value > list2.value) {
				LinkedNode next = list2.next;
				list2.next = newList;
				newList = list2;
				list2 = next;
				// } else if (list1.value == list2.value) {
				// list2 = list2.next;
				// list1 = list1.next;
			}

		}

		while (list1 != null) {
			LinkedNode next = list1.next;
			list1.next = newList;
			newList = list1;
			list1 = next;
		}

		while (list2 != null) {
			LinkedNode next = list2.next;
			list2.next = newList;
			newList = list2;
			list2 = next;
		}
		
		Util.printLinkedList(newList);
	}
}
