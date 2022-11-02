package Q522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		boolean o1 = (num1 == num2);
		
		System.out.println(o1);
		System.out.println(!o1);
	}

}