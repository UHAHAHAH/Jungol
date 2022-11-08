package Q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] cl = {85.6,79.5,83.1,80.0,78.2,75.0};
		double sum=0;
		int ban1 = scan.nextInt();
		int ban2 = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=6; i++) {
			if(i==ban1) {
				sum += cl[i-1];
			}
			else if(i==ban2) {
				sum += cl[i-1];
			}
		}
		System.out.printf("%.1f",(double)(sum));		
	}
}
