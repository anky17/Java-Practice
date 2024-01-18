package method;

public class MethodsDocs {

	/*
	 * ------------------Method---------------------
	 * # used for code re-usability
	 * # lines or block of code which is use to perform some specific
	 *   task in the program is known as method
	 *   
	 *   syntax:
	 *          
	 *          return_type method_name(arg1, arg2, ...argN){
	 *            //statement
	 *           }
	 *  	
	 *  	# return_type :
	 *    			a> void	 :no value(result) return from method.
	 *    			b> non-void	:value(result) return from method.
	 */
	
	static void sum(int a, int b) {
		int sum=0;
		sum=a+b;
		System.out.println("Sum = "+sum);
	}
	public static void main(String[] args) {
		int a=7,b=8;
		sum(a,b);
	}
}
