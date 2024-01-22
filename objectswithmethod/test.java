package objectswithmethod;

public class Test {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Customer a = new Customer();
		a = t.getEmp();
		t.printCustomer(a);
		
	}
	
	
	//-------object as parameter--------
	void printCustomer(Customer c) {
		System.out.println("Name = "+c.getName());
		System.out.println("Age ="+c.getAge());
		System.out.println("ID = "+c.getId());
		System.out.println("City = "+c.getCity());
		System.out.println("Phone ="+c.getPhone());
	}
	
	Customer getEmp() {
		
	Customer cr = new Customer();
	cr.setName("Ankit Diyal");
	cr.setAge(18);
	cr.setCity("MNR");
	cr.setId(11);
	cr.setPhone("9806428814");
	
	return cr;
	}

}
