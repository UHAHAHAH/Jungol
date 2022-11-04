package Q535;

/* 선생님 풀이와 동일(switch 문) */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double score = sc.nextDouble();
		sc.close();
		
		switch((int)score) {
		case 2:
			System.out.println("seasonal semester");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 4:
			System.out.println("scholarship");
			break;
		default:
			System.out.println("retake");
			break;
		} 
	}
}


///* 선생님 풀이 ( if 문 ) */
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		double inp = sc.nextDouble();
//		sc.close();
//
//		if (inp >= 4.0) {
//			System.out.println("scholarship");
//		} else if (inp >= 3.0) {
//			System.out.println("next semester");
//		} else if (inp >= 2.0) {
//			System.out.println("seasonal semester");
//		} else {
//			System.out.println("retake");
//		}
//	}
//}