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