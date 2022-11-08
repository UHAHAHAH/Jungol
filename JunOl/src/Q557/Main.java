package Q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] c = new char[10];

		for (int i = 0; i < 10; i++) {
			c[i] = sc.next().charAt(0);
		}
		sc.close();
		for (int i = 0; i < 10; i++) {
			if(i==0 || i==3 || i==6) {
				System.out.print(c[i]+" ");
			}	
		}
	}
}