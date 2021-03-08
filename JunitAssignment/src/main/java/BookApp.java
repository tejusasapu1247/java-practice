import java.util.ArrayList;
import java.util.List;

public class BookApp {
	List<Book> books=new ArrayList<Book>();
	public void addBook() {
		books.add(new Book("java", 12, 2000));
	}
	public boolean bookAvailability(Book book) {
		if(books.contains(book)) {
			return true;
		}
		return false;	
	}
}
