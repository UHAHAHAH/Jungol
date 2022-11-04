package Q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n=1;
		
		while(n>0 && n<5) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.printf("number? ");
			
			n = scan.nextInt();
			System.out.println();
			
			switch(n) {
			case 1:
				System.out.println("Seoul");
				break;
			case 2:
				System.out.println("Washington");
				break;
			case 3:
				System.out.println("Tokyo");
				break;
			case 4:
				System.out.println("Beijing");
				break;
			default:
				System.out.println("none");
				break;
			}
			System.out.println();
		}
		scan.close();		
	}
}

/* 선생님 풀이 */
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		int inp;
//
//		do {
//			System.out.println("1. Korea");
//			System.out.println("2. USA");
//			System.out.println("3. Japan");
//			System.out.println("4. China");
//			System.out.printf("number? ");
//			inp = scan.nextInt();
//
//			System.out.println();
//			if (inp == 1) {
//				System.out.println("Seoul");
//			} else if (inp == 2) {
//				System.out.println("Washington");
//			} else if (inp == 3) {
//				System.out.println("Tokyo");
//			} else if (inp == 4) {
//				System.out.println("Beijing");
//			}
//			System.out.println();
//		} while (1 <= inp && inp <= 4);
//		sc.close();
//		System.out.println("none");
//	}
//}
