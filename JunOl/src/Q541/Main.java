package Q541;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		sc.close();
		
		for(int i=1; i<=20; i++) {
			System.out.printf("%c",a);
		}		
	}
}
