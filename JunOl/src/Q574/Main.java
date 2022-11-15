package Q574;

import java.util.Scanner;

public class Main {
	public int Max(int x,int y,int z) {
		int max = Integer.MIN_VALUE;
		if(x>y)
		{
			if(x>z)
				max=x;
		}
		else if(y>z)
		{
			if(y>x)
				max=y;
		}else
			max=z;		
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int inp1=scan.nextInt();
		int inp2=scan.nextInt();
		int inp3=scan.nextInt();
		scan.close();
		
		Main hap = new Main();
		
		System.out.print(hap.Max(inp1, inp2, inp3));
	}
}