package Q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;

		do {
			n = sc.nextInt();

			if (n % 3 == 0) {
				System.out.println(n / 3);
			}
		} while (n != -1);
		sc.close();
	}
}