package looping;

public class oddevenSUM {

	public static void main(String[] args) {
		int even=0, odd=0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%2==0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		System.out.println("Sum of even = "+even);
		System.out.println("Sum of odd = "+odd);
		System.out.println("Sum of total = "+(even+odd));
	}
}
