package Q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = 1;
		sc.close();

		for (int i = 1; i <= n * m; i += m) {
			for (int j = i; j <= m * c; j++) {
				System.out.print(j + " ");
			}
			c++;
			System.out.println();
		}
	}
}


/* 선생님 문제풀이*/
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		sc.close();
//
//		int num = 1;
//		// 2. for문 풀이
//		for(int i =0; i< n;i++)
//		{
//			for(int j=0;j<m;j++)
//			{
//				System.out.print(num++ + " ");
//			}
//			System.out.println();
//		}
//		
//		
////		// 1. 배열풀이
////		int[][] ar = new int[n][m];
////
////		for (int i = 0; i < n; i++) {
////			for (int j = 0; j < m; j++)
////			{
////				ar[i][j] = num++;
////			}
////		}
////		
////		for (int i = 0; i < n; i++) {
////			for (int j = 0; j < m; j++)
////			{
////				System.out.print(ar[i][j]+" ");
////			}
////			System.out.println();
////		}		
//	}
//}