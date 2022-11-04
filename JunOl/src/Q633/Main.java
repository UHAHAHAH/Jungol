package Q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n=1;
		
		while(n>0 && n<5) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.printf("number? ");
			
			n = scan.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("\nSeoul\n");
				break;
			case 2:
				System.out.println("\nWashington\n");
				break;
			case 3:
				System.out.println("\nTokyo\n");
				break;
			case 4:
				System.out.println("\nBeijing\n");
				break;
			default:
				System.out.println("\nnone\n");
				break;
			}
		}
		scan.close();		
	}
}
