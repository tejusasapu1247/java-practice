package classesprg5;

class SearchTil{
	public int search(int a[],int ele) {
		return search(a,ele,0);
	}
	public int search(int a[],int ele,int pos) {
		for(int i=pos;i<a.length;i++) {
			if(a[i]==ele) {
				return i;
			}
		}
		return -1;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,34,15,3,54,34};
		int ele=34;
		SearchTil ob=new SearchTil();
		int x=ob.search(arr, ele);
		int y=ob.search(arr, ele, 3);
		System.out.println("x ="+x);
		System.out.println("y="+y);
	}

}
