package array;

import java.util.Scanner;

public class arrsec {
public static void main(String[] args) {
	 int i;
     int emp[] = new int[5];
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first five employee ID: ");
     
     for(i=0; i<emp.length; i++) {
    	 emp[i]=sc.nextInt();
     }
     
     System.out.println("The Employee ID's are: ");
     for(int x : emp) {
    	 System.out.print(x+" ");
     }
     sc.close();
}
}
