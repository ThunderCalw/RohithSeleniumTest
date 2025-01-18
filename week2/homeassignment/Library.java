package homeassignments;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj = new Library();
		obj.addBook("harry potter");
		obj.issueBook();
	}
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
}
