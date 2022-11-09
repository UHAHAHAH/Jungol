package Q155;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c= {'J', 'U', 'N', 'G', 'O', 'L'};
		
		char inp=sc.next().charAt(0);
		sc.close();
		
		switch(inp) {
		case 'J':
			System.out.println("0\n");
			break;
		case 'U':
			System.out.println("1\n");
			break;
		case 'N':
			System.out.println("2\n");
			break;
		case 'G':
			System.out.println("3\n");
			break;
		case 'O':
			System.out.println("4\n");
			break;
		case 'L':
			System.out.println("5\n");
			break;
		default:
			System.out.println("none\n");
			break;
		}		
	}
}
