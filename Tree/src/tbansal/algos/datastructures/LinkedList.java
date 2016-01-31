package tbansal.algos.datastructures;

public class LinkedList {

	private int intiallimit=50;
	int currentPos;
	Node[] nodes = new Node[intiallimit];
	Node front = null;

	public LinkedList(int intiallimit) {
		super();
		nodes = new Node[intiallimit];
		this.intiallimit = intiallimit;
	}

	public static void main(String[] args) {

	}

	public void add(int value) {
		front.setNext(++currentPos);
		front = new Node(currentPos, -1, value);
		nodes[currentPos] = front;

	}

	public void remove() {

	}

	public void remove(int position) {

	}

	public void add(int position, int value) {

	}

	Node current = nodes[0];

	public int next() {
		current = nodes[current.getNext()];
		return current.getValue();

	}

}

class Node {
	private int previous;
	private int next;
	private int value;

	public Node(int previous, int next, int value) {
		super();
		this.previous = previous;
		this.next = next;
		this.value = value;
	}

	public int getPrevious() {
		return previous;
	}

	public void setPrevious(int previous) {
		this.previous = previous;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
