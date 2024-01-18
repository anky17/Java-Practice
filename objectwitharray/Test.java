package objectwitharray;

import java.util.Scanner;

public class Test {


	public static void main(String[] args) {

		Product products[] = new Product[2];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < products.length; i++) {

			Product p = new Product();

			System.out.print("Enter the product name: ");
			p.setName(sc.next());

			System.out.print("Enter the product id: ");
			p.setId(sc.nextInt());

			System.out.println("Enter the price of the product: ");
			p.setPrice(sc.nextFloat());

			products[i] = p;
			
		}
		System.out.println("The array of products are: ");
		for (Product show : products) {

			System.out.println(show);
		}
	}

}
