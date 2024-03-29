package constructor;

public class User {
	
	String userName;
	String password;
	
	//parameterized constructor
	User(String userName, String password){
		
		this.userName = userName;
		this.password = password;
	}
	
	/* 'this' keyword is use to represent current object
	 *  * using this keyword we can call :
	 *  * instance variable
	 *  * instance methods
	 *  * constructor
	 */
	
	void printUser() {
		
		System.out.println("UserName = "+userName);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
	
	User u1 = new User("ank","pass");
	//u1.password = "ankit";
	//u1.userName = "Ankit Diyal";
	u1.printUser();
	}
}
