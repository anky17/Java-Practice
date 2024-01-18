package queue;

public class QueueCircular {

	private int front;
	private int rear;
	private int MAXSIZE = 10;
	int Queue[];

	QueueCircular() {
		front = MAXSIZE - 1;
		rear = MAXSIZE - 1;
		Queue = new int[MAXSIZE];

	}

	boolean isFull() {
		if (front == (rear + 1) % MAXSIZE) {
			return true;
		} else {
			return false;
		}
	}

	boolean isEmpty() {
		if (rear < front) {
			return true;
		} else {
			return false;
		}
	}
	
	void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
	}

}
