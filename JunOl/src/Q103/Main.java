package Q103;

public class Main {
	public static void main(String[] args) {
		for (int j = 1; j <= 2; j++) {
			for (int i = 1; i < 11; i++) {
				System.out.printf("%s", "T");
			}
			System.out.println();
		}
		for(int i=1; i<4; i++) {
			for(int j=1; j<2; j++) {
				System.out.printf("%6s", "TT");
			}
			System.out.println();
		}
	}
}