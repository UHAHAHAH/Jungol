package Q171;

import java.util.Scanner;

public class Main {
	int result(int a) {
		int result=0;
		for(int i=1; i<=a;i++)
		{
			result+=i;
		}		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		Main Sum = new Main();
		System.out.println(Sum.result(num));
	}
}