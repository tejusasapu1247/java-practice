import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("heyyy user....plzz enter the range:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		boolean isPrime = true;
		for (int number = n1; number <= n2; number++) {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}else {
					isPrime=true;
				}
			}
			if (isPrime) {
				System.out.println(number);
			}
		}
	}
}
