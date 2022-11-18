package Q525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		
		if(inp[0] >inp[1] && inp[0] >inp[2])
			System.out.print("1 ");
		else
			System.out.print("0 ");
		
		if(inp[0]==inp[1] && inp[1]==inp[2])
		{
			System.out.print("1 ");
		}
		else
			System.out.print("0 ");
	}
}

/* 다른 풀이 */
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		sc.close();
//		
//		boolean bol1 = n1>n2 && n1>n3;
//		boolean bol2 = n1==n2 && n2==n3;
//		
//		System.out.println(bol1 + " " +bol2);
//	}
//}