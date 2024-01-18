package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		
		p.id = 12;
		p.name = "Ankit";
		p.bonus = 12000;
		p.progLang = "CSIT";
		p.salary = 10000;
		p.company = "EB";
		p.project = "FB";
		
		p.print();
	}

}
