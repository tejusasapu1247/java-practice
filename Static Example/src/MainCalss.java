
public class MainCalss {

	private static boolean[] arr = new boolean[5];
	static {
		for (int i = 0; i < 5; i++) {
			arr[i] = true;
		}
	}

	public static void main(String[] args) {
		arr[0] = false;
		arr[3] = false;
		for (boolean b : arr) {
			if (b) {
				System.out.print("1 ");
			} else
				System.out.print("0 ");
		}
	}

}
