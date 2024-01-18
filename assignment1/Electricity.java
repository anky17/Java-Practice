package assignment1;
/*Create a model class Electricity. Electricity class has
	 a unit,  an amount,
	Generate a getter and setter methods:
	Create another class CalculateElectricity. Ask user to supply electricity unit then create the 
	switch case on the basics of following 
	condition.
	1 to 20 unit = Rs 100
	21 to 25 unit = Rs 5 per unit
	25 to 50 unit = Rs 10 per unit
	Above 50 unit Rs 2000 flat 
	Create the method calculateAmount() that takes electricity object as a parameter then return the 
	total amount to be paid
*/
	public class Electricity {
	
	private int unit;
	private int amount;
	
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
