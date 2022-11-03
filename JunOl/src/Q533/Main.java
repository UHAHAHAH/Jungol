package Q533;

/* 선생님 풀이와 동일 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();
		
		if(c=='M') {
			if(age >= 18) {
				System.out.println("MAN");
			}
			else if(age < 18) {
				System.out.println("BOY");
			}
		}
		else {
			if(age >= 18) {
				System.out.println("WOMAN");
			}
			else if(age < 18) {
				System.out.println("GIRL");
			}
		}
	}
}
