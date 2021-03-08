import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("teju");
		names.add("lovely");
		names.add("HCL TECHNOLOGIES");
		names.add("Sasapu");
		//for(int i=0;i<names.size();i++){
			//System.out.println(names.get(i));
			
		//}
		for(String iter:names) {
			System.out.println(iter);		
	}
	}
}
