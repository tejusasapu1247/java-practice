package demo_JAXB;

public class Book {
private int id;
private String title;
private double price;
private int copies;

public Book() {}
public Book(int id, String title, double price, int copies) {
	this.id = id;
	this.title = title;
	this.price = price;
	this.copies = copies;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getCopies() {
	return copies;
}
public void setCopies(int copies) {
	this.copies = copies;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", price=" + price + ", copies=" + copies + "]";
}

}
