package assignment1;

import java.util.Scanner;

/*Create another class CalculateElectricity. Ask user to supply electricity unit then create the 
	switch case on the basics of following 
	condition.
	1 to 20 unit = Rs 100
	21 to 25 unit = Rs 5 per unit
	25 to 50 unit = Rs 10 per unit
	Above 50 unit Rs 2000 flat 
	Create the method calculateAmount() that takes electricity object as a parameter then return the 
	total amount to be paid
	*/

public class  CalculateElectricity  {
	public static void main(String[] args) {
		
		Electricity e = new Electricity();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total electricity unit: ");
		e.setUnit(sc.nextInt());
		
		switch(e.getUnit()) {
		
		}
	}
	
	public float calculateAmount(Electricity e1) {
		int total = e1.getUnit();
		return total*25;
		
	}

}
