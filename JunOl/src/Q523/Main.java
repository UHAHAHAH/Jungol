package Q523;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		sc.close();
		
		boolean result1 = (num1>num2);
		boolean result2 = (num1<num2);
		boolean result3 = (num1==num2 || num1>num2);
		boolean result4 = (num1==num2 || num1<num2);
		
		System.out.println(num1+" > "+num2+" --- "+ result1);
		System.out.println(num1+" < "+num2+" --- "+result2);
		System.out.println(num1+" >= "+num2+" --- "+result3);
		System.out.println(num1+" <= "+num2+" --- "+result4);
	}

}
