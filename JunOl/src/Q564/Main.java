package Q564;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char num;
		int[] counter = new int[26];

		for (int i = 0; i < 100; i++) {
			num = scan.next().charAt(0);

			if (!(num >= 'A' && num <= 'Z')) {
				break;
			} else if ((int) num > 64 && (int) num < 91) {
				counter[(int) num - 65]++;
			}
		}

		scan.close();

		for (int i = 0; i < 26; i++) {
			if (counter[i] != 0)
				System.out.println((char)(i+65) + " : " + counter[i]);
		}
	}
}