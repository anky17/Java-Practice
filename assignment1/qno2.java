package assignment1;

import java.util.Scanner;

public class qno2 {

	public static void main(String[] args) {
		
		// Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
		
		float fren,cel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celcius:");
		cel = sc.nextFloat();
		
		fren = (float) (cel * 1.8) + 32; 
		/*
		 * System.out.println("Enter the temperatur in fahrenheit: ");
		   fren = sc.nextFloat();
		   cel =
				*/
		
		System.out.println("Temperature in Fahrenheit = "+fren);
	}
}
