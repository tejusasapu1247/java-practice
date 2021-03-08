package Example;

import java.util.ArrayList;
import java.util.Scanner;

class Solution<T>{
	private T val1,val2;
	Solution(T v1, T v2){
		this.val1=v1;
		this.val2=v2;
	}
	@SuppressWarnings("unchecked")
	public T add() {
		System.out.println( "type of value1="+ (T) val1.getClass().getName()+ 
				            "   type of value2="+ (T) val2.getClass().getName());
		return val1;
		
	}
}

public class GenericDemo1 {

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		ArrayList<T> arr= new ArrayList<>();
        System.out.println("enter the range of list:");
		int n=ip.nextInt();
        for(int i=0;i<n;i++) {
        	arr.add((T) ip.next());
		}
        for(Object v : arr) {
        	System.out.print(v+ " ");
        }
		
		System.out.println("printing integer values....");
		Solution<Integer> ob=new Solution<Integer>(110,19);
		System.out.println(ob.add());
		System.out.println();
		System.out.println("printing float values....");
		Solution<Float> ob1=new Solution<Float>(11.3F,13.4F);
		System.out.println(ob1.add());
		System.out.println();
		System.out.println("printing String values....");
		Solution<String> ob2=new Solution<String>("teju","moksha");
		System.out.println(ob2.add());
		System.out.println();

}
}