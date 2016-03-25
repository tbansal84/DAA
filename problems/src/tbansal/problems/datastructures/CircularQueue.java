package tbansal.problems.datastructures;

public class CircularQueue {

	int front = -1;
	int rear = -1;
	int limit = 50;
	int[] data = new int[limit];

	public void addRear(int value) {
		if (!isFull() && !isEmpty()) {
			rear = (rear + 1)%limit;
			data[rear] = value;
		} else if (isFull()) {
			throw new LimitExceedsException(this.getClass().getCanonicalName());
		} else if (isEmpty()) {
			front = rear = 0;
		}

	}

	private boolean isFull() {
		return (rear +1)%limit== front;
	}

	public int removeFront() {
		int result=0;
		if (front == rear) {
			front = rear = -1;
			result= data[front];
		} else if (!isEmpty()) {
			front =( front + 1)%limit;
			result= data[front];
		} else if(isEmpty()){
			throw new IndexOutofBoundException(this.getClass().getCanonicalName());
		}
		
		return result;

	}

	private boolean isEmpty() {
		return rear == -1 && front == -1;
	}

	public void addFront(int value) {
		if (!isFull() && !isEmpty()) {
			rear = (rear +limit- 1)%limit;
			data[rear] = value;
		} else if (isFull()) {
			throw new LimitExceedsException(this.getClass().getCanonicalName());
		} else if (isEmpty()) {
			front = rear = 0;
		}

	}

	public int removeRear() {
		int result=0;
		if (front == rear) {
			front = rear = -1;
			result= data[front];
		} else if (!isEmpty()) {
			front =( front +limit- 1)%limit;
			result= data[front];
		} else if(isEmpty()){
			throw new IndexOutofBoundException(this.getClass().getCanonicalName());
		}
		
		return result;
	}

}
