package queue;

public class Test {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		q.dequeue();		
	}
	

}
