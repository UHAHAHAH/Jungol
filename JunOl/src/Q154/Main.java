package Q154;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] b=new double[6];
		double avg =0;
		for(int i=0;i<6;i++) {
			b[i]=sc.nextDouble();
			avg+=b[i];
		}
		sc.close();
		
		System.out.printf("%.1f",avg/6);
	}
}