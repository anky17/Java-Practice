package objectwitharray;

public class Book {
	
	private String name;
	private int bookID;
	private String author;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "book [name=" + name + ", bookID=" + bookID + ", author=" + author + "]";
	}
	
	

}
