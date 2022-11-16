package Q576;

import java.util.Scanner;

public class Main {
	int EA(int n1,char c1,int n2) {
		int result;
		
		if(c1 == '+')
			result = n1 + n2;
		else if(c1 == '-')
			result = n1 - n2;
		else if(c1 == '*')
			result = n1 * n2;
		else if(c1 == '/')		
			result = n1 / n2;
		else
			result = 0 ;
		
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1=scan.nextInt();
		char c =scan.next().charAt(0);
		int num2=scan.nextInt();
		scan.close();
		
		Main Four = new Main();
		System.out.printf("%d %c %d = ",num1,c,num2);
		System.out.println(Four.EA(num1, c, num2));
	}
}
