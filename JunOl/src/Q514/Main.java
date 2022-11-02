package Q514;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.printf("height = ");
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		sc.close();
		
		System.out.printf("Your height is %dcm.",h);
	}
}
