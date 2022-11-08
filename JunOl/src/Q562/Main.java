package Q562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		int sum = 0;
		double avg = 0;
		int c=0;
	
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				avg += a[i];
				c++;
			} else {
				sum += a[i];
			}
		}
		avg = (double)avg/c;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg );
	}
}
