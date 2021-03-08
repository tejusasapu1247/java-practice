
public class Book {
	private String title;
	private int id;
	private int price;
	
	public Book(String title, int id, int price) {
		this.title = title;
		this.id = id;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", id=" + id + ", price=" + price + "]";
	}
	
}
