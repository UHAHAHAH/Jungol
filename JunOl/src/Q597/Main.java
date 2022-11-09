package Q597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		
		int sum=0;
		sum = str1.length()+str2.length();
		
		System.out.println(sum);
	}
}
