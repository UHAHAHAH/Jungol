package Q544;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int j=i; j<=100; j++) {
			sum+=j;
		}
		System.out.println(sum);
	}
}