package day2;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	private int noOfMonth[]= {-1,31,28,31,30,31,30,31,31,30,31,30,31};
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void printDateInforamt() {
		
	}
	boolean isLeapYear() {
	 return ((year % 400 == 0) || ( ( year % 100 != 0) && (year % 4 == 0 )));
	}
}
