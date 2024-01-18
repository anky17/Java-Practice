package method;

import java.util.Scanner;

public class qno2 {
	/*
	Q2> WAP to find si and Amount as :
		a> crate method input :
		-> create variables P,T and R
		-> get value of P,T , R from user.
		-> pass P,T and R to processing method
		-> call this method in main

		b> create method processing :
		-> pass P, T and R as arguments
		-> calculate SI = (P*T*R)/100;
		-> calculate Amount = SI + P;
		-> call output method and pass SI and Amount

		c> create method output :
		-> pass SI and Amount as arguments
		-> print SI
		-> print Amount
		*/
	public static void main(String[] args) {
		input();
	}
	static void input() {
		int P, T, R;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle: ");
		P = sc.nextInt();
		System.out.println("Enter the rate: ");
		R = sc.nextInt();
		System.out.println("Enter the time: ");
		T = sc.nextInt();
		method(P, T, R);
	}
	
	static void method(int P, int T, int R) {
		int SI = (P*T*R)/100;
		int amount =SI + P;
		output(SI,amount);
	}
	
	static void output(int SI, int amount) {
		System.out.println("SI = "+SI);
		System.out.println("Amount = "+amount);
	}
}
