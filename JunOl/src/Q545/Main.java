package Q545;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1;
		int sum1 = 0;
		int sum2 = 0;

		while (c > 0 && c <= 10) {

			int n = sc.nextInt();
			

			if(n%15 ==0) {
				sum1++;
				sum2++;
			}
			else if (n % 3 == 0) {
				sum1++;
			} else if (n % 5 == 0) {
				sum2++;
			}
			c++;
		}
		System.out.println("Multiples of 3 : " + sum1);
		System.out.println("Multiples of 5 : " + sum2);
	}
}
