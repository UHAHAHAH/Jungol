package Q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = 1;
		sc.close();

		for (int i = 1; i <= n * m; i += m) {
			if (c % 2 != 0) {
				for (int j = i; j <= m * c; j++) {
					System.out.print(j + " ");
				}
			} else {
				for (int j = m * c; j >= i; j--) {
					System.out.print(j + " ");
				}
			}
			c++;
			System.out.println();
		}
	}
}