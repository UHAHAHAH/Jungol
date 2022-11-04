package Q538;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.printf("number? ");
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		while(n1!=0){
			if(n1>0) {
				System.out.println("positive integer");
			}
			else if(n1<0){
				System.out.println("negative number");
			}	
			else {
				n1=0;
			}
			System.out.printf("number? ");				
			n1 = sc.nextInt();
		}
		sc.close();
	}
}
