package objectwitharray;

import java.util.Scanner;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Runbook {
	
	public static void main(String[] args) {
		 book books[] = new book[3];
		 Scanner sc = new Scanner(System.in);
		 
		 for(int i=0; i<books.length; i++) {
			 
			 book b = new book();
			 System.out.println("Enter the book id: ");
			 b.setBookID(sc.nextInt());
			 System.out.println("Enter the book name: ");
			 b.setName(sc.next());
			 System.out.println("Enter the author's name: ");
			 b.setAuthor(sc.next());
			 
			 books[i]=b;
			 
		 }
		 for(book show: books) {
			 System.out.println(show);
		 }
	}

}
