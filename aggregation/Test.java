package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setColor("Blue");
		c.setModel("XM65");
		c.setPrice(4500000);
		
		Student s = new Student();
		s.setCollege("Kathford");
		s.setName("Ankit Diyal");
		s.setId(11);
		s.setRollNo(11);
		s.setCar(c);
		
		System.out.println("Name = "+s.getName());
		System.out.println("Id = "+s.getId());
		System.out.println("---------Car Info---------");
		System.out.println("Color = "+c.getColor());
		System.out.println("Price = "+c.getPrice());
		System.out.println("Model = "+c.getModel());
		
	}
}
