package looping;

public class whileTEST {

	/*
	 * ---------while loop---------
	 * 
	 * syntax:
	 *    while(){
	 *    
	 *      //statement
	 *      //inc/dec
	 *    
	 *    }
	 */
	public static void main(String[] args) {
		
		int n = 5;
		int fact = 1;
		while(n>1){
			
			fact *= n;
			n--;

		}
		System.out.println(fact);
	}
}
