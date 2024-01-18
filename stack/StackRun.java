package stack;

import java.util.Scanner;

public class StackRun {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Stack2 st = new Stack2(5);
		do {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Stack top");
			System.out.println("4. Check Stack Status");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				int num;
				System.out.println("Enter the number to be pushed into the stack: ");
				num = sc.nextInt();
				System.out.println(num+" is pushed into the stack");
				st.push(num);
				break;
				
			case 2:
				System.out.println("Pop element: "+st.pop());
				break;
			case 3:
				System.out.println("Stack top is: "+st.peek());
				break;
			case 4:
				if(st.isEmpty()) {
					System.out.println("Stack is empty");
				}
				else {
					System.out.println("Stack is not empty");
				}
				break;
			case 5:
				System.out.println("It is closed.");
				break;
			default:
				System.out.println("Invalid input. Please enter the correct option.");
				break;

			}
		} while (choice != 5);
	}

}
