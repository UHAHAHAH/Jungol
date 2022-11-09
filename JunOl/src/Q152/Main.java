package Q152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[10];
		int odd=0;
		int even=0;
		
		for(int i=0; i<10;i++) {
			n[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<10; i++) {
			if((i%2!=0)) {
				even+=n[i];
			}
			else {
				odd+=n[i];
			}
		}
		System.out.println("odd : "+odd);
		System.out.println("even : "+even);
	}
}
