package Q114;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		
		System.out.println(++n1 + " " + n2);
		n2--;
		System.out.println(n1 + " " + n2);
	}
}
