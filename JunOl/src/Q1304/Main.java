package Q1304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		for (int i = 1; i <= num; i++) {
			int c = 1;
			for (int j = i; j <= num * c; j += num) {
				if (c > num)
					c = 0;
				else {
					System.out.print(j + " ");
					c++;
				}
			}
			System.out.println();
		}
	}
}