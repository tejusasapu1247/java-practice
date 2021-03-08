package demo_JAXB;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "lib", namespace = "https://www.hcltech.com/")
@XmlAccessorType(XmlAccessType.FIELD)
public class Libarary {
    @XmlElement(required = true)
    @XmlElement(name = "book")
    @XmlElementWrapper(name = "books")
    private List<Book> books=new ArrayList<>();
	private String LibName;
	private String libLocation;
	private boolean centralAc;
	
	public String getLibName() {
		return LibName;
	}

	public void setLibName(String libName) {
		LibName = libName;
	}

	public String getLibLocation() {
		return libLocation;
	}

	public void setLibLocation(String libLocation) {
		this.libLocation = libLocation;
	}

	public boolean isCentralAc() {
		return centralAc;
	}

	public void setCentralAc(boolean centralAc) {
		this.centralAc = centralAc;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	
}
