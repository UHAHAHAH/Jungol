package Q571;

import java.util.Scanner;

public class Main {

	String A = "~!@#$^&*()_+|";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main str = new Main();
		int num = sc.nextInt();
		sc.close();
		
		for(int i=0; i<num;i++)
		{
			System.out.println(str.A);
		}
	}
}


/* 선생님 문제풀이 */

//public class Main{
//	public static void printStr() {
//		System.out.println("~!@#$^&*()_+|");
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		
////		System.out.println(num);		
//		
//		for(int i=0; i<num;i++)
//		{
//			printStr();
//		}
//	}
//}