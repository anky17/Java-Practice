package selection;

import java.util.Scanner;

public class switchSalary {

	public static void main(String[] args) {
		int choice;
		Scanner sc =  new Scanner(System.in);
		System.out.println("\nMenu.\n");
		System.out.println("1.MD");
		System.out.println("2.CEO");
		System.out.println("3.MANAGER");
		System.out.println("4.HELPER");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch(choice) {
		   
		case 1:
			float totalsal = 0.0f;
			totalsal =230000f+ (230000*20)/100;
			System.out.println("\nPOST\tBasic salary\tbonus\ttotal salary");
			System.out.println("MD\t230000\t\t20%\t"+totalsal);
			break;
		case 2:
			float totalsal2 = 0.0f;
			totalsal2 =(float) (250000 + (250000*25.79)/100);
			System.out.println("\nPOST\tBasic salary\tbonus\ttotal salary");
			System.out.println("CEO\t250000\t\t25.79%\t"+totalsal2);
			break;
		case 3:
			float totalsal3 = 0.0f;
			totalsal3 =176000f+ (176000*16)/100;
			System.out.println("\nPOST\tBasic salary\tbonus\ttotal salary");
			System.out.println("MANAGER\t176000\t\t16%\t"+totalsal3);
			break;
		case 4:
			float totalsal4 = 0.0f;
			totalsal4 =145900 + (145900*9)/100;
			System.out.println("\nPOST\tBasic salary\tbonus\ttotal salary");
			System.out.println("HELPER\t145900\t\t49%\t"+totalsal4);
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
			sc.close();
	}
}
