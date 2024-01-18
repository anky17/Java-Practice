package looping;

public class jumpSTATEMENT {

	/*
	 * --------JUMP STATEMENT----------
	 *  a> break  --exit from the loop
	 *  b> continue  ---skip the value
	 *  c> return   ----exit from method
	 */
    public static void main(String[] args) {
	 
    	for(int i = 1; i<=10; i++) {
    		
    		if(i==5) {
    			return;
    			//continue;
    			//break;
    	}
    		System.out.println(i);

    	}
    }
}
