package Q569;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int count=0;
		
		int[][] stu = new int[5][4];
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<4;j++)
			{
				stu[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<4;j++)
			{
				 sum += stu[i][j];
				 if(j==3 && (sum/4)>=80)
				 {
					 System.out.print("pass");
					 sum=0;
					 count++;
				 }
				 else if(j==3 && (sum/4)<80)
				 {
					 System.out.print("fail");
					 sum=0;
				 }
			}
			System.out.println();
		}
		System.out.println("Successful : "+count);
	}
}
