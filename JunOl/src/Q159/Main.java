package Q159;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] score = new int[20];
		int b=0;
		
		for(int i=0; i<n;i++) {
			score[i] = scan.nextInt();
		}
		
		for(int i=0; i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(score[i]>score[j]) 
				{
					b=score[i];
					score[i]=score[j];
					score[j]=b;
				}
			}
		}
		scan.close();
		
		for(int i=0;i<n;i++) {
			System.out.println(score[i]);
		}
	}
}