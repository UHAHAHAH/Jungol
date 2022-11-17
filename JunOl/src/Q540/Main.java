package Q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		do {
			n = sc.nextInt();

			if (n % 3 == 0) {
				System.out.println(n / 3);
			}
		} while (n != -1);
		sc.close();
	}
}

/* 다른풀이 */
//public class Main {
//	int result() {
//		Scanner sc = new Scanner(System.in);
//
//		int result;
//
//		do {
//			result = sc.nextInt();
//
//			if (result % 3 == 0) {
//				System.out.println(result / 3);
//			}
//		} while (result != -1);
//		sc.close();
//
//		return result;
//	}
//
//	public static void main(String[] args) {
//		Main Three = new Main();
//		Three.result();
//	}
//}
