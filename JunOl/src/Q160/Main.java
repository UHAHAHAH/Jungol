package Q160;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] n = new int[10];
		int[] c = new int[6];

		for (int i = 0; i < 10; i++) {
			n[i] = scan.nextInt();
			c[n[i] - 1]++;
		}
		scan.close();

		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + " : " + c[i]);
		}
	}
}