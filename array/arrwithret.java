package array;

public class arrwithret {
	public static void main(String[] args) {
	int[] array  ={2,4,5,6,7,8,2,9};
	add(array);
}
	static void add(int[] values) {
	 int s = 0;
	 for(int x : values) {
		s = s + x;
	}
	 System.out.println("Total = "+s);
}
}
