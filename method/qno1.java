package method;

import java.util.Scanner;

public class qno1 {
	/*
	Q1> find area and volume as:
	a> create method getArea :
	-> pass l and b as arguments
	-> calculate area = l * b
	-> return area
	-> call area method in main

	b> create method volume :
	-> pass area and h as arguments
	-> calculate v = area * h
	-> print area
	-> print volume
	-> call this method in main
	*/
	public static void main(String[] args) {
		
		int l, b, h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		b = sc.nextInt();
		int area = getArea(l,b);
		System.out.println("Enter the height: ");
		h = sc.nextInt();
		volume(area,h);
		
		
	}
		 static int getArea(int l ,int b) {
			 int area = l * b;
			 return area;
		 }
		 
		 static void volume(int area, int h) {
			 int v =area * h;
			 System.out.println("Area = "+area);
			 System.out.println("Volume = "+v);
		 }
	
}
