

import java.time.LocalDateTime;
import java.time.LocalTime;
public class GetTime {
	public static void main(String args[]) {
	LocalTime time;
	time = LocalTime.now();
	System.out.println("The time now is :" +time);
	System.out.println("After 1 hr and 15 minutes the timw will be :" + time.plusHours(1).plusMinutes(15));
	System.out.println("today's date and the time now is :"+LocalDateTime.now());
	}
}
