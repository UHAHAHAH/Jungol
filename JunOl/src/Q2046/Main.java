package Q2046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int str = sc.nextInt();
		int sub = sc.nextInt();
		sc.close();

		switch (sub) {
		case 1:
			for (int i = 1; i <= str; i++) {
				int count = 1;
				for (int j = i; j <= str;) {
					if (count > str) {
						j = str + 1;
					} else {
						System.out.print(j + " ");
						count++;
					}
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= str; i++) {
				if (i % 2 != 0) {
					for (int j = 1; j <= str; j++) {
						System.out.print(j + " ");
					}
				} else {
					for (int j = str; j >= 1; j--) {
						System.out.print(j + " ");
					}
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = 1; i <= str; i++) {
				for (int j = 1; j <= str; j++) {
					System.out.print(i*j + " ");
				}
				System.out.println();
			}
			break;
		}
	}
}
