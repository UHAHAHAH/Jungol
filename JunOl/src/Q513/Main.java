package Q513;

public class Main {
	public static void main(String[] args) {
		
		double yd1 = 2.1;
		double yd2 = 91.44 * yd1;
		double in1 = 10.5;
		double in2 = 2.54 * in1;
		
		System.out.printf("%4.1fyd = %5.1fcm\n", yd1, yd2);
		System.out.printf("%4.1fin = %5.1fcm\n", in1, in2);
	}
}
