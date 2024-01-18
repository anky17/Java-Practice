package stack;

public class Stack2 {

	private int size;
	private int stack[];
	private int top;

	Stack2(int MAX_SIZE) {
		size = MAX_SIZE;
		stack = new int[size];
		top = -1;
	}

	public void push(int value) {
		if (!isFull()) {
			stack[++top] = value;
		} else {
			System.out.println("Stack is full. " + value + " cannot be pushed.");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			return stack[top--];
		}
		else {
			System.out.println("Stack is empty.........!");
			return -1;
		}
	}
	public int peek() {
		if(!isEmpty()) {
			return stack[top-1];
		}
		else{
			System.out.println("Stack is empty..!");
			return -1;
	 }
	}
	
	boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isFull() {
		if(top == size-1) {
			return true;
		}
		else {
			return false;
		}
	}

}
