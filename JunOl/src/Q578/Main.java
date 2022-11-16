package Q578;

import java.util.Scanner;

public class Main {
	void Goo(int x, int y) {
		if(x>y)
		{
			int inp=x;
			x=y;
			y=inp;			
		}
		for(int i=x;i<=y;i++)
		{
			System.out.printf("== %ddan ==\n",i);
			for(int j=1;j<10;j++)
			{
				System.out.printf("%d * %d = %2d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		
		Main view = new Main();
		view.Goo(n1,n2);
	}
}