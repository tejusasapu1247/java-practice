import java.time.LocalDate;

public class GetDate {
	public static void main(String args[]) {
		LocalDate bdate, today;
		today = LocalDate.now();
		System.out.println("today's date : "+today);
		System.out.println("Today's day of the week :" +today.getDayOfWeek());
		bdate= LocalDate.of(1999, 01, 16);
		System.out.println("My bday date : "+bdate);
		System.out.println("Is my bday date in the past? : "+ bdate.isBefore(today));
		System.out.println("IS my bday in a leap year? "+bdate.isLeapYear());
		System.out.println("My bday's day of the week :" +bdate.getDayOfWeek());
		System.out.println("My bday is on  :" +bdate.getDayOfMonth());
		System.out.println("My bday's month :" +bdate.getMonthValue());
		System.out.println("My bday's year :" +bdate.getYear());
	}
}
