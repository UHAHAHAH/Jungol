package Q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[100];

		for (int i = 0; i < 100; i++) {
			n[i] = sc.nextInt();

			if (n[i] == 0) {
				for (int j = i-1; j >= 0; j--) {
					System.out.print(n[j] + " ");
				}
				break;
			}
		}
		sc.close();
	}
}