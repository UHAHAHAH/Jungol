package Q593;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("ASCII code =? ");
		int i = sc.nextInt();
		
		while(i>32 && i<128) {
			System.out.printf("%c\n",i);
			System.out.printf("ASCII code =? ");
			i = sc.nextInt();
		}
		sc.close();
	}
}