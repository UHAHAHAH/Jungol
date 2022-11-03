package Q121;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		
		if(n==0) {
			System.out.println("zero");
		}
		else if(n>0) {
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}

	}
}
