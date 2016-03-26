package tbansal.problems.datastructures.linkedlist;

public class CloneListwithRandomPointers {

	public static void main(String[] args) {

		RandomLinkedNode n1 = new RandomLinkedNode(1, null);

		RandomLinkedNode n2 = new RandomLinkedNode(2, null);
		RandomLinkedNode n3 = new RandomLinkedNode(3, null);
		RandomLinkedNode n4 = new RandomLinkedNode(4, null);
		RandomLinkedNode n5 = new RandomLinkedNode(5, null);
		RandomLinkedNode n6 = new RandomLinkedNode(6, null);
		RandomLinkedNode n7 = new RandomLinkedNode(7, null);
		RandomLinkedNode n8 = new RandomLinkedNode(8, null);
		RandomLinkedNode n9 = new RandomLinkedNode(9, null);
		RandomLinkedNode n10 = new RandomLinkedNode(10, null);
		RandomLinkedNode n11 = new RandomLinkedNode(11, null);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = n11;

		n1.linkedNode = n5;
		n4.linkedNode = n2;

	}

	// user hashmap to create nodes and iterate original again to create random
	// pointer
	private static void clone(RandomLinkedNode n) {

	}
}

class RandomLinkedNode extends LinkedNode {

	public RandomLinkedNode linkedNode;

	public RandomLinkedNode(int value, LinkedNode next) {
		super(value, next);
	}

}
