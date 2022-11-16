package Q170;

import java.util.Scanner;

public class Main {
	void Printf(char inp) {
		for(int i=1;i<=10;i++)
		{
			System.out.print("@");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		
		Main Three = new Main();
		System.out.println("first");
		Three.Printf(c);
		System.out.println("second");
		Three.Printf(c);
		System.out.println("third");
		Three.Printf(c);
	}
}
