package Q568;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] n1= new int[2][4];
		int[][] n2 =new int[2][4];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				n1[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				n2[i][j]=scan.nextInt();
			}
		}
		scan.close();
		
		System.out.println("first array");
		System.out.println("second array");
		
		for(int i=0; i<2;i++)
		{
			for(int j=0; j<4; j++)
			{
				n1[i][j]*=n2[i][j];
				System.out.print(n1[i][j]+" ");
			}
			System.out.println();
		}
	}
}