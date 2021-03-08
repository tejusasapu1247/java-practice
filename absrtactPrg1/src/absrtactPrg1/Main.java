package absrtactPrg1;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Graphics{
	protected int x1,y1;
	protected int x2,y2;
	public void setStart(int x,int y) {
//		System.out.printf(" (%d,%d)%n ",x,y);
		x1=x;
		y1=y;
	}
	public void setEnd(int x,int y) {
//		System.out.printf(" (%d,%d)%n ",x,y);
		x2=x;
		y2=y;
	}
	public abstract void draw();
}

class Line extends Graphics{
	public void draw() {
		System.out.printf("draw a line from (%d,%d) to (%d,%d) %n",x1,y1,x2,y2);
	}
	
}
class Rectangle extends Graphics{
	public void draw() {
		System.out.printf("draw a Rectangle from (%d,%d) to (%d,%d) %n",x1,y1,x2,y2);
	}	
}
public class Main {
	static void drawUtil(int x1,int y1,int x2,int y2,Graphics g) {
		g.setStart(x1, y1);
		g.setEnd(x2, y2);
		g.draw();
	}
	public static void main(String []args) {
		//drawUtil(10,10,20,30,new Graphics());
		drawUtil(12, 13, 14, 15, new Line());
		drawUtil(3, 4, 5, 6, new Rectangle());
//		Graphics p=new Graphics();
////		p.setStart(2,3);
////		p.setEnd(4, 5);
////		p.draw();
//		
//		Line l=new Line();
//		l.setStart(2,3);
//		l.setEnd(4, 5);
//		l.draw();
//		
//		Rectangle r=new Rectangle();
//		r.setStart(2,3);
//		r.setEnd(4, 5);
//		r.draw();
		
		String[] names= {"teju","moksha","lovely"};
		ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
		for(String s:list) {
			if(s.equals("teju")) {
				System.out.println(s.toUpperCase());
		}else {
			System.out.println(s);
		}
		}
		list.replaceAll(s -> s.toUpperCase());
		System.out.println("after  using lambda: list = "+list);
		list.removeIf(s -> s.equals("TEJU"));
		System.out.println(list);
		
		
		
		
	}
}
