package array;

import java.util.Scanner;

public class array3D {
	//Syntax:
	/*
	 * 	data_type arrayname[][] = new data_type[row][col];
	 */
	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		Scanner sc  = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				
				System.out.println("Enter value: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The array is: ");
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				
				System.out.print(mat[i][j]+" ");

			}
			System.out.println();
		}
}
}
