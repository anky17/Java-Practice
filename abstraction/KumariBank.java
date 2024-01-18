package abstraction;

public class KumariBank extends CentralBank {

	@Override
	void getBankName() {
		System.out.println("Kumari Bank");
	}

	@Override
	void getInterestRate() {
		System.out.println("8.9%");

	}

}
