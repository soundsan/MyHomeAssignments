package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		Library book = new Library();
		String bookName = book.addBook("Alice Adventure in Wonderland");
		System.out.println("The Issued book is " + bookName);
		book.issueBook();
	}

}
