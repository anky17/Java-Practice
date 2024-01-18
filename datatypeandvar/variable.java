
package datatypeandvar;
import java.util.Scanner;

public class variable {
/*
 * #Type: 
 * a> Local variable
 * b> Instance variable
 * c> Static variable
 * d> Reference variable
 */
	public static void main(String[] arg) {
		//WAP TO FIND AREA OF RECTANGLE
		int l ;
		int b ;

		//Scanner class is used to read data from user/console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		l=sc.nextInt();
		
		System.out.println("Enter the breath of rectangle:");
		b=sc.nextInt();
		
		int area = l + b;
		System.out.println("Area = "+area);
	sc.close();
	}
}
