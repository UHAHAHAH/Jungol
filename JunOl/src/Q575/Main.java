package Q575;

import java.util.Scanner;

public class Main {
	
	int Result(int a, int b)
	{
		int result=1;
		
		for(int i=1; i<=b;i++)
		{
			result *= a;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int inp1 = scan.nextInt();
		int inp2 = scan.nextInt();
		scan.close();
		
		Main Je = new Main();
		System.out.println(Je.Result(inp1, inp2));		
	}
}