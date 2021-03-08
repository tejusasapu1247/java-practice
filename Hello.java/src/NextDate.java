import java.util.Scanner;

public class NextDate {
 public static void main(String args[]){
	 Scanner sc= new Scanner(System.in);
	 int d,m,y;
	 d=sc.nextInt();
	 m=sc.nextInt();
	 y=sc.nextInt();
	 if(m==2) {
		 if((y % 400 == 0) || ( ( y % 100 != 0) && (y % 4 == 0 )) && d==28) {
			 System.out.print(++d +"/"+m+"/"+y);
		 }
		 else {
			 System.out.print(1+"/"+ ++m +"/"+y);
		 }
	 }
	 else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12 ) {
		 if(d<30) System.out.print(++d +"/"+m +"/"+y);
		 if(d==31)	System.out.print(1 +"/"+ ++m +"/"+y);	
	 }
	 
	 else if((m==4 || m==6 || m==9 || m==7 || m==11) &&(d>30)) {
		 System.out.print(1 +"/"+ ++m +"/"+y);
	 }
	 else {
		 System.out.print(++d +"/"+m +"/"+y);
	 }
 }
}
