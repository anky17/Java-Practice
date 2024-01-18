package assignment1;

import java.util.Scanner;

public class qno1 {
  public static void main(String[] args) {
	  /*
	   * Write a program to find sum and average of two numbers input by User (using Scanner 
         class)
	   */
	  int x,y,sum;
	  float average;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the first number: ");
	  x=sc.nextInt();
	  System.out.println("Enter the second number: ");
	  y=sc.nextInt();
	  if(x!=0 && y!=0) {
		  sum=x+y;
		  System.out.println("Sum = "+sum);
		  average = (float)(sum)/2;
		  System.out.println("Average = "+average);
	  }
	  else {
		  System.out.println("Error : Invalid numbers.");
	  }
	  
	  
  }
}
