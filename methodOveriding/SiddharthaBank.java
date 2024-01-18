package methodOveriding;

public class SiddharthaBank extends CentralBank{
	
	@Override
	void getBankName() {
		
		System.out.println("Siddhartha Bank");
	
	}
	
	@Override
	void getInterestRate() {
		
		System.out.println("8.9%");
	
	}

}
