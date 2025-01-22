package week1.day3;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library book = new Library();
		String bookName = book.addBook("Alice Adventure in Wonderland");
		System.out.println("The book name is " + bookName);
		book.issueBook();
	}
}
