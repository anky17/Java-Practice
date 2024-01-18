package method;

import java.util.Scanner;

public class methodNORETNOARGS {

	public static void main(String[] args) {
		
		add();
		area();
	}
	
	
   // 1. no return type with no arguments
	static void add() {
		int a = 29;
		int b = 30;
		
		int i = a+b;
		System.out.println("Sum = "+i);
	}
	
	static void area() {
		int l ,b;
		Scanner sc = new Scanner(System.in);
		
		int area=l*b;
		
		System.out.println("Area of rectangle = "+area);
	}
}
