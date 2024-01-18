package array;

public class addition {
	public static void main(String[] args) {
		
		int mat1[][] = {{2,3,4},{4,5,6},{7,8,9}};
		int mat2[][] = {{1,1,1},{1,1,1},{1,1,1}};
		int mat3[][] = new int[3][3];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.println("Matrix after addition:");
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
