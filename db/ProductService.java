package db;

public class ProductService {
	
	static List<Product>=plist
			
			
			
	public void addProduct(Product prod) {
		plist.add(prod);
		System.out.println("----------------added success==size="+plist.size());
		try {
			Class.forName("");
			String sql ="insert into product(eid,product name,company)values('+prod.getName()+"','"+prod.getprice()+"')";
					
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteProduct(int id) {
		
	}
	public list<Product> getAllProducts(){
		
	}

}
