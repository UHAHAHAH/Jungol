package Q1856;

import java.util.Scanner;

/* 첫번째 풀이 */
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int c = 1;
//		sc.close();
//
//		for (int i = 1; i <= n * m; i += m) {
//			if (c % 2 != 0) {
//				for (int j = i; j <= m * c; j++) {
//					System.out.print(j + " ");
//				}
//			} else {
//				for (int j = m * c; j >= i; j--) {
//					System.out.print(j + " ");
//				}
//			}
//			c++;
//			System.out.println();
//		}
//	}
//}

/* 두번째 풀이 */
class Think{
	private int n;
	private int m;
	
	void Input(int n, int m) {
		this.n = n;
		this.m = m;
	}
	
	void OperationPrint() {
		int c=1;
		for (int i = 1; i <= n * m; i += m) {
			if (c % 2 != 0) {
				for (int j = i; j <= m * c; j++) {
					System.out.print(j + " ");
				}
			} else {
				for (int j = m * c; j >= i; j--) {
					System.out.print(j + " ");
				}
			}
			c++;
			System.out.println();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		Think finish = new Think();
		finish.Input(n, m);
		finish.OperationPrint();
	}
}

/* 선생님 문제풀이 */

//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		sc.close();
//		
////// 2nd 풀이
//		int[][] ar = new int[n][m];
//		int num=1;
//		for(int i=0;i<n;i++)
//		{
//			if (i % 2 == 0) {
//				for (int j = 0; j < m; j++) {
//					ar[i][j] = num++;
//				}
//			}
//			else {
//				for(int j=m-1;j>=0;j--)
//				{
//					ar[i][j] = num++;
//				}
//			}
//		}
//		
//		for(int i= 0;i<n;i++)
//		{
//			for(int j=0;j<m;j++)
//			{
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
////// 1st 풀이		
////		int num = 1;
////		for (int i = 0; i < n; i++) {
////			if (i % 2 == 0) {
////				if (i != 0) {
////					num = num + (m + 1);
////				}
////				for (int j = 0; j < m; j++) {
////					System.out.print(num + " ");
////					num++;
////				}
////			} else {
////				num = num + (m - 1);
////				for (int j = 0; j < m; j++) {
////					System.out.print(num + " ");
////					num--;
////				}
////			}
////			System.out.println();
////		}
//		
//	}
//}
