package Q521;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		--num2;
		
		int sum = num1 * num2;
		
		num1++;
		
		System.out.print(num1 + (" "));
		System.out.print(num2 + (" "));
		System.out.println(sum);
	}
}

///* 선생님 문제풀이 */
//
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int inp1 = scan.nextInt();
//		int inp2 = scan.nextInt();
//		scan.close();
//
//		int res = inp1++ * --inp2;
//
//		System.out.print(inp1 + " " + inp2 + " " + res);
//	}
//}