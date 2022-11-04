package Q632;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		scan.close();

		int min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;

		System.out.println(min);
	}
}

///* 선생님 풀이 */
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		sc.close();
//		
//		if(num1 > num2) {
//			if(num2 > num3) {
//				System.out.println(num3);
//			}
//			else {
//				System.out.println(num2);
//			}
//		}
//		else {
//			if(num1 > num3) {
//				System.out.println(num3);
//			}
//			else {
//				System.out.println(num1);
//			}
//		}	 
//	}
//}
