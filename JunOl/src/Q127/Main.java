package Q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int c = 0;
		double avg = 0;

		while (n >= 0 && n <= 100) {
			sum += n;
			c++;
			n = sc.nextInt();
		}
		sc.close();
		avg = (double)sum / c;
		System.out.printf("sum : %d\n", sum);
		System.out.printf("avg : %.1f\n", avg);
	}

}
