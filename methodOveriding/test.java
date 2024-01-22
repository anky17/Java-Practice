package methodOveriding;

public class Test {
	
	public static void main(String[] args) {
		
		
		//static or early binding of object
		NabilBank nb = new NabilBank();
		
		nb.getBankName();
		nb.getInterestRate();
		
		//up-casting
		CentralBank b = new PrabhuBank();
		
	}
		//late or dynamic binding of object
		//runtime polymorphism
		
		void printBankInfo(CentralBank bn) {
			bn.getBankName();
			bn.getInterestRate();
		}
}
