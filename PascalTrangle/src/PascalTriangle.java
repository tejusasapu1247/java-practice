
public class PascalTriangle {
	public static void main(String agrs[]) {
		int x[][]=new int[6][6];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == j)
					x[i][j] = 1;
				else
					x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
			}
			System.out.println();
		}

		for (int k = 0; k < x.length; k++) {
			for (int j = 0; j <= k; j++) {
				System.out.print(" "+x[k][j]+" ");
			}
			System.out.println();
		}
	}
}
