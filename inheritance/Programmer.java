package inheritance;

public class Programmer extends Employee{
	
	String progLang;
	String project;
	int bonus;
	
	void print() {
		
		super.print();  // super keyword represents the parent class method. 
		System.out.println("ProgLang = "+progLang);
		System.out.println("Project = "+project);
		System.out.println("Bonus = "+bonus);
	}
}
