package selection;

public class Iftest {
/*
 * --------if----------
 * 
 * syntax:
 * 
 *       if(condition){
 *        //statement
       }
 */
	public static void main(String[] args) {
		int salary=109000;
		if(salary < 30000) {
			salary += 8000;
		}
		System.out.println("Your total salary = "+salary);
	}
}
