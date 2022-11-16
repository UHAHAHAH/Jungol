package Q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		if(n1 < n2) {
			System.out.println(n2-n1);
		}
		else {
			System.out.println(n1-n2);
		}	
	}
}

/* 함수를 이용하여 풀이 */

//public class Main {
//	public int Sum(int x, int y) {
//		int result;
//		if(x>y)
//			result = x-y;
//		else
//			result = y-x;
//		
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int inp1 = sc.nextInt();
//		int inp2 = sc.nextInt();
//		sc.close();
//		
//		Main hap = new Main();
//		hap.Sum(inp1, inp2);
//		System.out.println(hap.Sum(inp1, inp2));
//	}
//}

/* 선생님 문제풀이 */

//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);		
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		sc.close();
//		
////		System.out.println(n1+" "+n2);
//
//		  /*1st 풀이*/		
//		if(n1 > n2) {
//			System.out.println(n1-n2);
//		}
//		else {
//			System.out.println(n2-n1);
//		}	
//
//		  /*2nd 풀이*/
//		System.out.println(Math.abs(n1-n2));
//	}
//}

