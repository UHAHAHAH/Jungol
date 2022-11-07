package Q593;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("ASCII code =? ");
		int i = sc.nextInt();
		
		while(i>32 && i<128) {
			System.out.printf("%c\n",i);
			System.out.printf("ASCII code =? ");
			i = sc.nextInt();
		}
		sc.close();
	}
}

/* do while 문 */
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int inp = 0;
//
//		do {
//			System.out.printf("ASCII code =? ");
//			inp = sc.nextInt();
//			if (inp > 32 || inp < 128) {
//				break;
//			}
//			System.out.printf("%c\n", inp);
//		} while ( 33 <= inp && inp <= 127);
//		sc.close();
//	}
//}