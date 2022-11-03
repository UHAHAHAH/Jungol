package Q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = 0;
		int sum = 0;
		sc.close();
		
		while(c!=n+1) {
			sum+=c;
			c++;
		}
		
		System.out.println(sum);
	}
}
