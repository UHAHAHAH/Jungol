package Q158;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] n = new int[100];
		int count = 0;

		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();

			if (n[i] == 0) {
				scan.close();
				System.out.println(i);
				break;
			}
			count++;
		}

		for (int i = 0; i < count; i++) {
			if (n[i] % 2 == 0) {
				n[i] = n[i] / 2;
				System.out.print(n[i] + " ");
			} 
			else {
				n[i] = n[i] * 2;
				System.out.print(n[i] + " ");
			}
		}
	}
}