package method;

public class returnTYPEwithNoargs {
	
	public static void main(String[] args) {
		
		System.out.println("Sum = "+findsumof1to100());
	}

	static int findsumof1to100() {
		int s=0;
		for(int i=1; i<=100; i++) {
			s = s+i;
		}
		return s;
	}
}
