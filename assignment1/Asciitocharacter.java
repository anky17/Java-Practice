package assignment1;

import java.util.Scanner;

public class Asciitocharacter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ascii = 0;
		System.out.println("Enter any valid ASCII value: ");
		ascii = sc.nextInt();
		char character = (char) (ascii);
		System.out.println("It's corresponding character is: "+character);
		
	}

}
