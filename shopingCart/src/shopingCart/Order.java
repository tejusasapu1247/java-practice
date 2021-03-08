package shopingCart;

public class Order {
static final char CORP= 'C';
static final char PRIVATE= 'P';
static final char NONPROFIT= 'N';
String name;
double total;
String stateCode;
double disc;
char custType;
public Order(String name, double total, String state, char custType) {
	this.name = name;
	this.custType= custType;
	this.total=total;
	this.stateCode= state;
	calDiscount();
}
public void calDiscount() {
	// TODO Auto-generated method stub
	if(custType==NONPROFIT) {
		if(total>900) {
			disc=10.00;
		} else {
			disc=5.00;
		}
	}else if(custType==PRIVATE) {
			if(total>900) {
				disc=7.00;
			}else	disc=0;
	}else if(custType==CORP) {
		if(total<500) {
			disc=8.00;
		}else	disc=5.00;
	}
}
public String getDiscount() {
	return Double.toString(disc) +"%";
}
}