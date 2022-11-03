package Q112;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2= scan.nextInt();
		scan.close();
		
		int n3 = n1/n2;
		int n4 = n1%n2;
		
		System.out.println(n1+" / "+n2+" = "+n3+"..."+n4);		
	}
}
