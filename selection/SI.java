package selection;

import java.util.Scanner;

public class SI {
// WAP TO FIND THE SI WHERE VALUE OF P,T AND R IS NOT ZERO.
	public static void main(String[] args) {
		float p,t,r,SI;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the principle: ");
	 p=sc.nextFloat();
	 System.out.println("Enter the interest: ");
	 t=sc.nextFloat();
	 System.out.println("Enter the rate: ");
	 r=sc.nextFloat();
	 if(p != 0 && r != 0 && t != 0) {
		 SI=(p*t*r)/100;
		 System.out.println("SI = "+SI);
	 }
	 sc.close();
 }
}
