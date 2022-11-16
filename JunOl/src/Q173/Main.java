package Q173;

import java.util.Scanner;

public class Main {
	int minus(int x, int y) {
		int result;

		if (y > x) {
			int inp = x;
			x = y;
			y = inp;
		}

		x *= x;
		y *= y;

		result = x - y;

		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		input.close();

		Main number = new Main();
		System.out.println(number.minus(num1, num2));
	}
}