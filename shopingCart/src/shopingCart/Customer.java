package shopingCart;
public class Customer {
	private String name;
	private String ssn;
	Customer(String nm,String SSN){
		this.name=nm;
		this.ssn=SSN;
	}
	public String getName() {
		return name;
	}
//	public void setName(String nm) {
//		name=nm;
//	}
	public String getSsn() {
		return ssn;
	}
//	public void setSsn(String ssn) {
//		this.ssn = ssn;
//	}
}
