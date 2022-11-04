package Q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int c = 0;
		int sum = 0;

		while (c != n + 1) {
			sum += c;
			c++;
		}

		System.out.println(sum);
	}
}

///* 선생님 풀이( while 문 ) */
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int inp = sc.nextInt();
//		sc.close();
//		int sum = 0, j =1;
//
//		while (j <= inp )) {
//			sum += inp++;
//		}
//
//		System.out.println(sum);
//	}
//}

///* 선생님 풀이( For 문 ) */
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int inp = sc.nextInt();
//		sc.close();
//
//		int sum = 0;
//
//		for (int i = 1; i <= inp; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}
//}