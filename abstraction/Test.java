package abstraction;

public class Test {
	public static void main(String[] args) {

		CentralBank b = new KumariBank();
		b.getBankName();
		b.getInterestRate();
		b.moneyExRate();

		UserService us = new UserServiceImpl();
		us.addUser();
		us.deleteUser();
		us.print();
	}

}
