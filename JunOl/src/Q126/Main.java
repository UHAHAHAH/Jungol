package Q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int h =0;
		int j =0;
		
		while(n != 0 ) {
			if(n%2==0) {
				j++;
			}
			else if(n%2!=0) {
				h++;
			}
			n = scan.nextInt();
		}
		scan.close();
		System.out.printf("odd : %d\neven : %d",h,j);
	}
}