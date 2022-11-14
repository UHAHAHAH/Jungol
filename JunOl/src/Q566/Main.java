package Q566;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] n = new int[3];
		
		n[0] = 100;
		n[1] = scan.nextInt();
		scan.close();
		
		System.out.print(n[0]+" "+n[1]);
		
		while(true)
		{	
			n[2]=n[0]-n[1];
			n[0]=n[1];
			n[1]=n[2];			
			
			System.out.print(" "+n[2]);
			
			if(n[2]<0) {	
				break;
			}
		}
	}
}