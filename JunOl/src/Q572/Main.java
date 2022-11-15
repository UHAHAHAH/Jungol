package Q572;

import java.util.Scanner;

public class Main {
	double P(int num) {
		double pi = (double)num*(double)num*3.14;
		return pi;
	}
	void action() {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		sc.close();
		double result = P(num);
		System.out.printf("%.2f",result);
	}
	public static void main(String[] args) {
		Main Piprint = new Main();
		Piprint.action();
	}
}

