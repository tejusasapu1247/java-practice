interface Matcher{
	boolean match(int value1,int value2);
}
class SearchAlgo{
	public final int search(int a[],int ele,Matcher matcher) {
		for(int i=0;i<a.length;i++)
		{
			if(matcher.match(a[i],ele))	return i;
		}
		return -1;
	}
}

class EqualityMatcher implements Matcher{

	@Override
	public boolean match(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1==value2;
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int ele=20;
		SearchAlgo algo=new SearchAlgo();
		int ind=algo.search(a, ele, new EqualityMatcher());
		if(ind==-1) {
			System.out.println("not found the element....");
		}
		else {
			System.out.println("Found at "+ind);
		}
	}

}
