package selection;

import java.util.Scanner;

public class areaofrec {
    public static void main(String[] args) {
	  int l, b, area;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length: ");
      l=sc.nextInt();
      System.out.println("Enter the breath: ");
      b=sc.nextInt();
      if( l!=0 && b!=0) {
    	  area=l*b;
    	  System.out.println("Area of rectangle = "+area);
      }
     sc.close();      

}
}
