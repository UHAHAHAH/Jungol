package Q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double score = sc.nextDouble();
		sc.close();
		
		switch((int)score) {
		case 2:
			System.out.println("seasonal semester");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 4:
			System.out.println("scholarship");
			break;
		default:
			System.out.println("retake");
			break;
		} 
	}
}
