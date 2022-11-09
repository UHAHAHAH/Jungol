package Q153;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];

		for (int i = 0; i < 100; i++) {
			a[i] = sc.nextInt();

			if (a[i] == -1 && i >= 3) {
				System.out.printf("%d %d %d\n", a[i - 3], a[i - 2], a[i - 1]);
				break;
			} else if(a[i] == -1 && i < 3){
				for (int j = 0; j < i; j++) {
					System.out.printf("%d ", a[j]);
				}
				break;
			}
		}
		sc.close();
	}
}