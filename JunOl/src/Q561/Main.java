package Q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[] = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int max=0;
		int min=10000;
		int nc=0;
		int xc=0;

		for (int i = 0; i < 10; i++) {
			if(a[i]<0 || a[i]>=10000) {
				a[i]=100;
			}
			else if(a[i]<100) {
				if(max<a[i]) {
					max=a[i];
					xc++;
				}
			}
			else if(a[i]>=100) {
				if(min>a[i]) {
					min=a[i];
					nc++;
				}
			}
		}
		if(xc==0) {
			max=100;
		}
		else if(nc==0){
			min=100;
		}
		System.out.print(max+" "+min);
	}
}