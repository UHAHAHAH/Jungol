package Q123;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.printf("Number? ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		
		switch(num) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
			default:
				System.out.println("I don't know.");
				break;
		}
	}
}
