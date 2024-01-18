package looping;

public class enhanceFORLOOP {

	/*
	 * ------Enhance for loop / for each loop
	 *  use to read data from collection (Array, List, Set, Map, etc)
	 *  
	 *  syntax:
	 *  
	 *     for(data_type var : collection){
	 *       //statement
	 *     }
	 */
	public static void main(String[] args) {
		int[] values = {2,3,4,4,2,2,3,2,3,2,12,3,23};
		int sum=0;
		for(int x : values) {
			sum += x;
		}
		System.out.println("Sum = "+sum);
	}
}
