package Q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		int c=1;
		sc.close();
		
		for(int i=1;i<=n*m;i+=m)
		{
			for(int j=i;j<=m*c;j++)
			{
				System.out.print(j+" ");
			}
			c++;
			System.out.println();
		}		
	}
}