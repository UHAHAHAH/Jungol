package Q565;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[10];
		
		boolean c = true;

		while (c) {
			int num = sc.nextInt();
			
			if(num==0)
				break;
			else
				count[num/10]++;
		}
		sc.close();
		
		for(int i=0; i<10;i++)
		{
			if(count[i]!=0)
			{
				System.out.println(i +" : "+ count[i]);
			}
		}
	}
}