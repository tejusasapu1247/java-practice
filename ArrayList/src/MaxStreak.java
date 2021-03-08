import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxStreak {
	@SuppressWarnings("resource")
	public static void main(String arg[]) {
	Scanner ip=new Scanner(System.in);
	int n= ip.nextInt();
	int flag=0,count=0;
	List<String> data= new ArrayList<>();
	for(int i=0;i<n;i++) {
		data.add(ip.nextLine());
	}
	for(String i:data) {
		char[] Arr = i.toCharArray();
		for(char j:Arr) {
			if(j=='Y')	flag=1;
			else {
				flag=0;
				break;
			}
		}
		if(flag==1)	count++;
	}
	System.out.println("the max count = "+count);
}


}