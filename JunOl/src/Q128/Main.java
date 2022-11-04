package Q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count =0;
		do {
			if(num%3!=0 &&num%5!=0) {
				count++;
			}
			num = sc.nextInt();
		}while(num !=0);
		sc.close();
		System.out.println(count);
	}
}