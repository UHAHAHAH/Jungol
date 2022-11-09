package Q151;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] n = new int[5];
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			n[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < 5; i += 2) {
			sum += n[i];
		}
		System.out.print(sum);
	}
}
