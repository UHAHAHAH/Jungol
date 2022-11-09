package Q157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] n=new int[100];
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		int sum=0;
	
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
			
			if(n[i]==0) {
				System.out.println("Multiples of 5 : "+count);
				System.out.println("sum : "+ sum);
				System.out.printf("avg : %.1f\n",(sum/(double)count));
				break;
			}
			else if(n[i]%5==0){
				count++;
				sum+=n[i];
			}
		}
		sc.close();
	}
}