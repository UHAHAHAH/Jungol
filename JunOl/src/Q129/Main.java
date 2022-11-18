package Q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char c;
		System.out.printf("Base = ");
		int x = scan.nextInt();
		System.out.printf("Height = ");
		int y = scan.nextInt();
		double width = (double)(x * y)/2;
		System.out.printf("Triangle width = %.1f\n",width);
		System.out.printf("Continue? ");
		c = scan.next().charAt(0);
		
		while(c=='y' || c=='Y') {
			System.out.printf("Base = ");
			x = scan.nextInt();
			System.out.printf("Height = ");
			y = scan.nextInt();
			width = (double)(x * y)/2;
			System.out.printf("Triangle width = %.1f\n",width);
			System.out.printf("Continue? ");
			c = scan.next().charAt(0);
		}
		scan.close();
	}
}
