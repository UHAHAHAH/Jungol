package Q124;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();

		switch (n) {
		case 1:
		case 3:
		case 5:
		case 7: 
		case 8: 
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		default:
			System.out.println("30");
			break;
		}
	}
}
