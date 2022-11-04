package Q543;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		scan.close();
		
		for(int j=1; j<=i; j++) {
			if(j%2==0) {
				System.out.printf("%d ",j);
			}
		}
	}
}
