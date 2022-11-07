package Q594;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String i = scan.next();
		scan.close();
		
		for(int j=1; j<3; j++) {
			System.out.printf("%s", i);
		}
	}
}

/* 선생님 문제풀이 */
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		String inp = scan.next();
//		scan.close();
//
//		for (int i = 0; i < 2; i++) {
//			System.out.print(inp + inp);
//		}
//	}
//}