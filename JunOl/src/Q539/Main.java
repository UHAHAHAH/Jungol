package Q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		while (num < 100) {
			sum += num;
			count++;
			num = scan.nextInt();
		}
		count+=1;
		scan.close();
		sum += num;
		avg += (double) sum / count;
		System.out.printf("%d\n%.1f\n", sum, avg);
	}
}
