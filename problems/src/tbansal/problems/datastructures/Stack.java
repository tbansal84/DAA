package tbansal.problems.datastructures;

public class Stack {

	private int[] data = new int[50];
	int index = -1;

	public void push(int value) {
		if (index < 50) {
			data[index++] = value;
		} else {
			throw new LimitExceedsException(this.getClass().getCanonicalName());
		}

	}

	public int pop() {
		if (index != -1) {
			return data[index--];
		} else {
			throw new IndexOutofBoundException(this.getClass().getCanonicalName());
		}
	}

}
