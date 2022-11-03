package Q524;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		
		boolean a1 = (n1 != 0);
		boolean a2 = (n2 != 0);
		
		System.out.println(a1 + " " + a2);

	}
}
