package method;

public class noRETURNTYPEWITHARGS {

	public static void main(String[] args) {
		
		printTable(8);
	}
	
	static void printTable(int n) {
	
		for(int i=1; i<=n; i++) {
			System.out.println(n+" x "+i+" = "+(i*n));
		}
	}
}
