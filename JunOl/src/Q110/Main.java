package Q110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.printf("yard? ");
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		sc.close();
		
		System.out.printf("%.1fyard = %.1fcm",n,(n*91.44));
	}
}