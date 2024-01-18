package method;

public class returntypeandargs {
	public static void main(String[] args) {
		int large = largest(3,6);
		System.out.println("Largest = "+large);
	}

	static int largest(int x, int y) {
		if(x>y) {
			return x;
		}
		return y;
	}
}
