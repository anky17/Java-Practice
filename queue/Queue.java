package queue;

public class Queue {

	private int front;
	private int rear;
	final static int MAXSIZE = 10;
	int Queue[];

	Queue() {
		int front = -1;
		int rear = -1;
		Queue = new int[MAXSIZE];
	}

	boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	boolean isFull() {
		if (rear == MAXSIZE - 1)
			return true;
		else
			return false;
	}

	void enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full." + value + " can't be inserted.");
		} else {
			Queue[++front] = value;
			System.out.println(value + " is inserted.");
		}
	}

	int dequeue() {
		int value;
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		} else {
			value = Queue[front++];
			return value;
		}
	}

}
