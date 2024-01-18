package array;

import java.util.Arrays;

public class oddret {
	public static void main(String[] args) {
	int[] oddNum = odd();
	for(int x : oddNum) {
	System.out.println(x+" ");
	}
}
	static int[] odd() {
		int []oddArr = new int[50];
		int index = 0;
		for(int i=1; i<=oddArr.length; i++) {
			if(i%2!=0) {	
				oddArr[index]=i;
				index++;
			}
	}
		return oddArr;
 }
}