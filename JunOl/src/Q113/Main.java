package Q113;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int l = sc.nextInt();
		sc.close();

		w += 5;
		l *= 2;
		int a = w * l;

		System.out.println("width = " + w);
		System.out.println("length = " + l);
		System.out.println("area = " + a);

	}
}
