package looping;

import java.util.Scanner;

public class sumofRange {
	// WAP TO FIND THE SUM OF GIVEN RANGE
	public static void main(String[] args) {
		int a, b, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the beginning range: ");
		a = sc.nextInt();
		System.out.println("Enter the ending range: ");
		b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}
}
