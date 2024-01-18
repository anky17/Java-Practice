package objectwitharray;

public class Product {
	
	private String name;
	private float price;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", id=" + id + "]";
	}
	
	
}
