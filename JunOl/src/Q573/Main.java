package Q573;

import java.util.Scanner;

public class Main {
	void Na(int num) {
		int count=1;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();
		sc.close();
		
		Main Nsum = new Main();
		Nsum.Na(inp);
	}
}

/* 선생님 문제풀이 */

//public class Main{
//	public void rectangle(int p) {
//		int c=1;
//		for(int i=0;i<p;i++)
//		{
//			for(int j=0;j<p;j++)
//			{
//				System.out.print(c++ + " ");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.close();
//		
//		//System.out.println(n);
//		Main m = new Main();
//		m.rectangle(n);
//	}
//}