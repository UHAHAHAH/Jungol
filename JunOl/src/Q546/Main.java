package Q546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		for(int i=1; i<=n; i++) {
			int sc = scan.nextInt();
			sum+=sc;
		}
		scan.close();
		avg = (double)sum/n;
		if(avg>=80) {
			System.out.printf("avg : %.1f\n",avg);
			System.out.println("pass");
		}
		else {
			System.out.printf("avg : %.1f\n",avg);
			System.out.println("fail");
		}
	}
}
