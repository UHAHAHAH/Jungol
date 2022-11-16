package Q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int n = sc.nextInt();
		sc.close();
		
		int c = a.length();
		
		if(n>c) {
			for(int i=(c-1); i>=0; i--) {
				System.out.printf("%c",a.charAt(i));
			}
		}
		else {
			for(int i=(c-1); i>=(c-n); i--) {
				System.out.printf("%c",a.charAt(i));
			}
		}
	}
}

/* 함수 풀이 */
//public class Main {
//	void inp(String a, int n) {
//		int c = a.length();
//
//		if (n > c) {
//			for (int i = (c - 1); i >= 0; i--) {
//				System.out.printf("%c", a.charAt(i));
//			}
//		} else {
//			for (int i = (c - 1); i >= (c - n); i--) {
//				System.out.printf("%c", a.charAt(i));
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String a = sc.next();
//		int n = sc.nextInt();
//		sc.close();
//
//		Main Big = new Main();
//		Big.inp(a, n);
//	}
//}