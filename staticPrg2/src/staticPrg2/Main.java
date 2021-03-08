package staticPrg2;

import java.text.SimpleDateFormat;
import java.util.Date;

class MyDateUtil{
	static final String target_date_pattern="mm/dd/yyyy";
	public static String getFormattedDate(Date d) {
		SimpleDateFormat sdf=new SimpleDateFormat(target_date_pattern);
		return sdf.format(d);	
	}	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyDateUtil util=new MyDateUtil();
		Date now=new Date();
		System.out.println(now);
		
		String FormattedDate=MyDateUtil.getFormattedDate(now);
		System.out.println(FormattedDate);
	}

}
