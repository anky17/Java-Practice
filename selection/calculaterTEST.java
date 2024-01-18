package selection;

import java.util.Scanner;

public class calculaterTEST {

	public static void main(String[] args) {
		
		int a,b;
		char op;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter second number: ");
		b=sc.nextInt();
		System.out.println("\tOption\n");
		System.out.println("Add +\nSub -\nMul *\nDivide /\nTo exit press e");
		System.out.println("Enter your choice : ");
		op=sc.next().charAt(0);
		
		switch(op){
		
		case '+':
			int sum = a+b;
			System.out.println("Sum = "+sum);
			break;
		
		case '-':
			int diff = a-b;
			System.out.println("Difference = "+diff);
			break;
		case '*':
			int mul = a*b;
			System.out.println("Multiplication = "+mul);
			break;
		case '/':
			int div = a/b;
			System.out.println("Division = "+div);
			break;
		case 'e':
			System.out.println("Press any key to exit.");
			break;
		default:
			System.out.println("Invalid");
		}
		sc.close();
	}
}
