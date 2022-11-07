package Q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] c = new char[10];

		for (int i = 0; i < 10; i++) {
			c[i] = scan.next().charAt(0);
		}
		scan.close();
		for (int i = 0; i < 10; i++) {
			System.out.print(c[i]);
		}
	}
}