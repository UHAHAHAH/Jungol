package Q534;

import java.util.Scanner;

///* switch 문 풀이*/
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		char a = sc.next().charAt(0);
//		sc.close();
//		
//		switch(a) {
//		case 'A':
//			System.out.println("Excellent");
//			break;
//		case 'B':
//			System.out.println("Good");
//			break;
//		case 'C':
//			System.out.println("Usually");
//			break;
//		case 'D':
//			System.out.println("Effort");
//			break;
//		case 'F':
//			System.out.println("Failure");
//			break;
//		default:
//			System.out.println("error");
//			break;
//		}
//	}
//}

/* IF 문 풀이*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		sc.close();
		
		if(a=='A') {
			System.out.println("Excellent");
		}
		else if(a=='B') {
			System.out.println("Good");
		}
		else if(a=='C') {
			System.out.println("Usually");
		}
		else if(a=='D') {
			System.out.println("Effort");
		}
		else if(a=='F') {
			System.out.println("Failure");
		}
		else {
			System.out.println("error");
		}
	}
}
