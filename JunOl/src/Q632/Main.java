package Q632;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		scan.close();
		
		int min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;
		
		System.out.println(min);		
	}
}
