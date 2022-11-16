package Q172;

import java.util.Scanner;

public class Main {
	public void Sqaure(int Num) {
		
		for(int i=1;i<=Num;i++)
		{
			for(int j=1;j<=Num;j++)
			{
				System.out.printf("%d ",j*i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		Main SQ = new Main();
		SQ.Sqaure(num);
	}
}